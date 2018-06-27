package com.liu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.liu.entity.Product;

/**
*  @author  刘伟
*/
public interface ProductMapper {
	/**
	 * 获取每页的产品内容
	 * @param object	对应的产品对象
	 * @param currentpage  当前页码
	 * @param pagenum    	每页的产品数量
	 * @return			产品的集合
	 */
	@Select("SELECT * FROM ${product}")
	public List<Product> selectProduct(@Param("product")String product);
	/**
	 * 统计耳机有多少产品
	 * @return 产品的数量
	 */
	@Select("SELECT count(*) FROM ${product}" )
	public int num(@Param("product") String product);
	/**
	 * * 向数据库中添加数据
	 * @param product 数据库表名
	 * @param path	Excel文件路径
	 * @return 受影响行数
	 */
	@InsertProvider(type=ProductSql.class,method="insertProductSql")
	public int insertProduct(Product product);
	/**
	 * 查找表，在不同的表中插入数据
	 * @param product 产品
	 * @param table		选择数据库表
	 * @return 受影响行数
	 */
	@InsertProvider(type=ProductSql.class,method="insertProductTableSql")
	public int insertProductTable(@Param("product")Product product,@Param("table")String table);
	/**
	 * 通过ID值查询产品
	 * @param product
	 * @return
	 */
	@Select("SELECT * FROM bluetooth WHERE id=#{id}")
	public Product selectProductByID(Product product);
	
}