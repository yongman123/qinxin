package com.liu.service;

import java.util.List;

import com.liu.entity.Product;

/**
*  @author  刘伟
*/
public interface iPDService {
	/**
	 * 产品页面跳转
	 * @param object 产品对象
	 * @param currentpage 当前页
	 * @param pagenum	页面显示数量
	 * @return 产品对象集合
	 */
	public List<Product> pageJunp(String product,int currentpage,int pagenum );
	/**
	 * 最后页
	 * @param product 产品类型
	 * @param pagenum 每页的产品数量
	 * @return 最后页
	 */
	public  int lastpage (String product,int pagenum);
	
}
