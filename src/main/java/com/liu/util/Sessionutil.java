
package com.liu.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 刘伟
 */
public class Sessionutil {
	private static Sessionutil sessionutil;
	private static SqlSessionFactory sqlSessionFactory;

	private Sessionutil() {
		super();

	}

	// 静态方法块加载配置
	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	public static Sessionutil getinstance() {
		if (sessionutil == null) {
			sessionutil = new Sessionutil();
		}
		return  sessionutil;
	}
	public SqlSession getsession() {
		SqlSession session = sqlSessionFactory.openSession();
		return session;
		
	}
}
