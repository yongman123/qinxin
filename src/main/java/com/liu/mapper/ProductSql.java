
package com.liu.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.liu.entity.Product;

/**
 * 刘伟
 */
public class ProductSql {
	/**
	 * * 向数据库中添加数据
	 * 
	 * @param product
	 *            数据库表名
	 * @param path
	 *            Excel文件路径
	 * @return 受影响行数
	 */
	public String insertProductSql(Product product) {
		return new SQL() {
			{
				INSERT_INTO("quality");
				if (product.getId() != null && product.getId() != "") {
					VALUES("id", "#{id}");
				}
				if (product.getName() != null && product.getName() != "") {
					VALUES("name", "#{name}");
				}
				if (product.getImage() != null && product.getImage() != "") {
					VALUES("image", "#{image}");
				}
				if (product.getDetail() != null && product.getDetail() != "") {
					VALUES("detail", "#{detail}");
				}
				if (product.getSname() != null && product.getSname() != "") {
					VALUES("sname", "#{sname}");
				}
				if (product.getPrice() > 0) {
					VALUES("price", "#{price}");
				}
				if (product.getSales() >= 0) {
					VALUES("sales", "#{sales}");
				}
				if (product.getPercent() > 0) {
					VALUES("percent", "#{percent}");
				}
				if (product.getCommission() >= 0) {
					VALUES("commission", "#{commission}");
				}
				if (product.getWangwang() != null && product.getWangwang() != "") {
					VALUES("wangwang", "#{wangwang}");
				}
				if (product.getTbksurl() != null && product.getTbksurl() != "") {
					VALUES("tbksurl", "#{tbksurl}");
				}
				if (product.getTbkurl() != null && product.getTbkurl() != "") {
					VALUES("tbkurl", "#{tbkurl}");
				}
				if (product.getTaokouling() != null && product.getTaokouling() != "") {
					VALUES("taokouling", "#{taokouling}");
				}
				if (product.getCouponsnum() >= 0) {
					VALUES("couponsnum", "#{couponsnum}");
				}
				if (product.getCouponsonlynum() >= 0) {
					VALUES("couponsonlynum", "#{couponsonlynum}");
				}
				if (product.getCouponsprice() != null && product.getCouponsprice() != "") {
					VALUES("couponsprice", "#{couponsprice}");
				}
				if (product.getBegintime() != null && product.getBegintime() != "") {
					VALUES("begintime", "#{begintime}");
				}
				if (product.getEndtime() != null && product.getEndtime() != "") {
					VALUES("endtime", "#{endtime}");
				}
				if (product.getCouponsonurl() != null && product.getCouponsonurl() != "") {
					VALUES("couponsonurl", "#{couponsonurl}");
				}
				if (product.getQtkl() != null && product.getQtkl() != "") {
					VALUES("qtkl", "#{qtkl}");
				}
				if (product.getCouponsonsurl() != null && product.getCouponsonsurl() != "") {
					VALUES("couponsonsurl", "#{couponsonsurl}");
				}
				if (product.getYxjh() != null && product.getYxjh() != "") {
					VALUES("yxjh", "#{yxjh}");
				}
			}
		}.toString();

	}
	
	/**
	 * * 向数据库中添加数据,根据不同的表
	 * @param product   数据库表名
	 * @param path	  Excel文件路径
	 * @return 受影响行数
	 */
	public String insertProductTableSql(final Map<String, Object> map) {
		Product product =(Product) map.get("product");
		String  table = (String) map.get("table");
		return new SQL() {
			{
				INSERT_INTO(table);
				if (product.getId() != null && product.getId() != "") {
					VALUES("id", "#{product.id}");
				}
				if (product.getName() != null && product.getName() != "") {
					VALUES("name", "#{product.name}");
				}
				if (product.getImage() != null && product.getImage() != "") {
					VALUES("image", "#{product.image}");
				}
				if (product.getDetail() != null && product.getDetail() != "") {
					VALUES("detail", "#{product.detail}");
				}
				if (product.getSname() != null && product.getSname() != "") {
					VALUES("sname", "#{product.sname}");
				}
				if (product.getPrice() > 0) {
					VALUES("price", "#{product.price}");
				}
				if (product.getSales() >= 0) {
					VALUES("sales", "#{product.sales}");
				}
				if (product.getPercent() > 0) {
					VALUES("percent", "#{product.percent}");
				}
				if (product.getCommission() >= 0) {
					VALUES("commission", "#{product.commission}");
				}
				if (product.getWangwang() != null && product.getWangwang() != "") {
					VALUES("wangwang", "#{product.wangwang}");
				}
				if (product.getTbksurl() != null && product.getTbksurl() != "") {
					VALUES("tbksurl", "#{product.tbksurl}");
				}
				if (product.getTbkurl() != null && product.getTbkurl() != "") {
					VALUES("tbkurl", "#{product.tbkurl}");
				}
				if (product.getTaokouling() != null && product.getTaokouling() != "") {
					VALUES("taokouling", "#{product.taokouling}");
				}
				if (product.getCouponsnum() >= 0) {
					VALUES("couponsnum", "#{product.couponsnum}");
				}
				if (product.getCouponsonlynum() >= 0) {
					VALUES("couponsonlynum", "#{product.couponsonlynum}");
				}
				if (product.getCouponsprice() != null && product.getCouponsprice() != "") {
					VALUES("couponsprice", "#{product.couponsprice}");
				}
				if (product.getBegintime() != null && product.getBegintime() != "") {
					VALUES("begintime", "#{product.begintime}");
				}
				if (product.getEndtime() != null && product.getEndtime() != "") {
					VALUES("endtime", "#{product.endtime}");
				}
				if (product.getCouponsonurl() != null && product.getCouponsonurl() != "") {
					VALUES("couponsonurl", "#{product.couponsonurl}");
				}
				if (product.getQtkl() != null && product.getQtkl() != "") {
					VALUES("qtkl", "#{product.qtkl}");
				}
				if (product.getCouponsonsurl() != null && product.getCouponsonsurl() != "") {
					VALUES("couponsonsurl", "#{product.couponsonsurl}");
				}
				if (product.getYxjh() != null && product.getYxjh() != "") {
					VALUES("yxjh", "#{product.yxjh}");
				}
			}
		}.toString();

	}
}
