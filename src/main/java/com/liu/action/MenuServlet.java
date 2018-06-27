package com.liu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.entity.Product;
import com.liu.mapper.ProductMapper;
import com.liu.util.Sessionutil;

public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MenuServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String path =request.getServletPath();
		int page=Integer.valueOf(request.getParameter("page"));
		int num=Integer.valueOf(request.getParameter("num"));
		SqlSession session=Sessionutil.getinstance().getsession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		List<Product> list=new ArrayList<>();
		PageHelper.startPage(page, num);
		switch (path) {
		case "/Menu.do":
			list = mapper.selectProduct("quality");
			break;
		case "/Line.do":
			list = mapper.selectProduct("line");
			break;
		case "/Bluetooth.do":
			list = mapper.selectProduct("bluetooth");
			break;
		case "/TWS.do":
			list = mapper.selectProduct("tws");
			break;
		case "/DIY.do":
			list = mapper.selectProduct("diy");
			break;
		}
		PageInfo<Product> info= new PageInfo<>(list, 5);
		int[] pagenums= info.getNavigatepageNums();
		int lastpage = info.getLastPage();
		System.out.println(lastpage);
		JSONObject jsonObject =new JSONObject();
		jsonObject.put("list", list);
		jsonObject.put("pagenums", pagenums);
		jsonObject.put("lastpage", lastpage);
		String json = jsonObject.toJSONString();
		PrintWriter out =response.getWriter();
		out.println(json);
	}

}
