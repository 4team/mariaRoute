package org.maruhan.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//1. 추가해주는 것을 잊었다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {

	@Autowired
	DataSource ds;
	
	protected static final Logger logger =  LoggerFactory.getLogger(DataSourceTest.class);
	
	//2. Test도 잊지 말자.
	@Test
	public void test() throws Exception{
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from tbl_route");
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " + rs.getDouble(3)+" " + rs.getDouble(4));
		}
	}

}
