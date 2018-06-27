
package com.liu.Mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.liu.entity.Product;
import com.liu.mapper.ProductMapper;
import com.liu.util.ExcelUnit;
import com.liu.util.Sessionutil;

/**
*刘伟
*/
public class ProductMapperTest {

	
	public void testNum() {
		Sessionutil sessionutil =Sessionutil.getinstance();
		SqlSession session=sessionutil.getsession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		int num=mapper.num("line");
		System.out.println(num);
	}
	
	public void testInsertProduct() {
		Sessionutil sessionutil =Sessionutil.getinstance();
		SqlSession session=sessionutil.getsession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
//		String path="D:\\Java\\excel\\Bluetooth.xls";
//		String path="D:\\Java\\excel\\DIY.xls";
//		String path="D:\\Java\\excel\\quality.xls";
		String path="D:\\Java\\excel\\tws.xls";
//		String path="D:\\Java\\excel\\line.xls";
		
//		String table="bluetooth";
//		String table="diy";
//		String table="quality";
//		String table="tws";
//		String table="line";
		ExcelUnit excelUnit =new ExcelUnit();
		List<Product> list=excelUnit.excelIn(path);
		int row=0;
		for (Product product : list) {
			Product product2=mapper.selectProductByID(product);
			if (product2 ==null) {
				mapper.insertProduct(product);
				session.commit();
			}else {
				continue;
			}
			row++;
		}
		System.out.println(row);
	}
	
	@Test
	public void testInsertProductTable() {
		Sessionutil sessionutil =Sessionutil.getinstance();
		SqlSession session=sessionutil.getsession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		String path="D:\\Java\\excel\\Bluetooth.xls";
		String table="bluetooth";
		ExcelUnit excelUnit =new ExcelUnit();
		List<Product> list=excelUnit.excelIn(path);
		int row=0;
		for (Product product : list) {
			Product product2=mapper.selectProductByID(product);
			if (product2 ==null) {
				mapper.insertProductTable(product,table);
				session.commit();
			}else {
				continue;
			}
			row++;
		}
		System.out.println(row);
	}
}
