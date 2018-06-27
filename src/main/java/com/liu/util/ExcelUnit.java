
package com.liu.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.liu.entity.Product;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


/**
 * 表格的导入 刘伟
 */
public class ExcelUnit {
	
	public List<Product> excelIn(String path) {
		List<Product> list =new ArrayList<>();
		Workbook workbook = null;
		try {
			// 获取Excel对象
			workbook = Workbook.getWorkbook(new File(path));
			//  获取选项卡 
			Sheet sheet =workbook.getSheet(0);
			//循环选项卡中的值
			for (int i = 1,len=sheet.getRows(); i < len; i++) {
				Product product =new Product();
				//获取单元格对象，取得单元格的值，并放入对象中
				product.setId(sheet.getCell(0, i).getContents());
				product.setName(sheet.getCell(1, i).getContents());
				product.setImage(sheet.getCell(2,i).getContents());
				product.setDetail(sheet.getCell(3, i).getContents());
				product.setSname(sheet.getCell(4, i).getContents());
				product.setPrice(Float.valueOf(sheet.getCell(5, i).getContents()));
				product.setSales(Integer.valueOf(sheet.getCell(6, i).getContents()));
				product.setPercent(Float.valueOf(sheet.getCell(7, i).getContents()));
				product.setCommission(Float.valueOf(sheet.getCell(8, i).getContents()));
				product.setWangwang(sheet.getCell(9, i).getContents());
				product.setTbksurl(sheet.getCell(10, i).getContents());
				product.setTbkurl(sheet.getCell(11, i).getContents());
				product.setTaokouling(sheet.getCell(12, i).getContents());
				product.setCouponsnum(Integer.valueOf(sheet.getCell(13, i).getContents()));
				product.setCouponsonlynum(Integer.valueOf(sheet.getCell(14, i).getContents()));
				product.setCouponsprice(sheet.getCell(15, i).getContents());
				product.setBegintime(sheet.getCell(16, i).getContents() );
				product.setEndtime(sheet.getCell(17, i).getContents());
				product.setCouponsonurl(sheet.getCell(18, i).getContents());
				product.setQtkl(sheet.getCell(19, i).getContents());
				product.setCouponsonsurl(sheet.getCell(20, i).getContents());
				product.setYxjh(sheet.getCell(21, i).getContents());
				list.add(product);
			}
		} catch (IOException | BiffException e) {
			e.printStackTrace();
		}finally {
			workbook.close();
		}
		return list;
	}
}
