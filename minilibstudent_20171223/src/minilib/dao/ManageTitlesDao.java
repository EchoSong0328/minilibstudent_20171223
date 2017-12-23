package minilib.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import minilib.util.*;
import minilib.vo.CodeBookType;
import minilib.vo.Title;

//这里都是业务，这里的方法一般都有Action类来调用

public class ManageTitlesDao {
	public List findAll() throws Exception{
		//建立数据库连接
		List list = new ArrayList() ;
		Connection con;
		
		try {
			con = DBUtil.getConnnection();
			if(con == null){
				System.out.print("数据库未连接！");	
			}
		//定义查询语句
		  Statement sql;
		  ResultSet rs;
		  sql = con.createStatement();
		  rs = sql.executeQuery("SELECT * from t_book");
	           
	       //查询获得的结果  
		   rs.next();
	       while(rs.next())
	       {  /*System.out.print("<tr>");
	          System.out.print("<td >"+rs.getString(1)+"</td>"); 
	          System.out.print("<td >"+rs.getString(2)+"</td>");
	          System.out.print("<td >"+rs.getDate("birthday")+"</td>"); 
	          System.out.print("<td >"+rs.getFloat("salary")+"</td>");
	          System.out.print("</tr>") ; */
	    	   
	    	   Title title = new Title();
	    	   title.setIsbn( rs.getString(3));
	    	   title.setTitle(rs.getString(5));
	    	   title.setAuthors(rs.getString(6));
	    	   title.setPressid(rs.getString(8));
	    	   list.add(title);
	    	     
	        }
	       
	        //System.out.print("</table>");
	        rs.close();
	        sql.close();
	        con.close();
	    
		}catch(Exception e){
			
		}
		return list;
		
	}
	//我写的findBookType
	public  List<CodeBookType> findBookType()
			throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException
			{
				List list = new ArrayList();
				Connection conn=DBUtil.getConnnection();
				Statement stmt = conn.createStatement();
				//定义查询图书类型语句
				String strsql = "select ";
				strsql = strsql + "codeid,codename";
				strsql = strsql + " from code_booktype order by codeid ";
			
				System.out.print("strsql="+strsql);	
				ResultSet rs = stmt.executeQuery(strsql);
				while (rs.next()){
					CodeBookType booktype = new CodeBookType();
					booktype.setCodeId(rs.getString(1));
					booktype.setCodeName(rs.getString(2));				
					list.add(booktype);
				}
				rs.close();
				stmt.close();
				conn.close();
				return list;
			}
	//我写的saveTitle
	public void saveTitle(Title book)
			throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException
		    {
				Connection conn=DBUtil.getConnnection();
				String sql = "insert into t_book(isbn,title,authors) "
						+ "values ('"+book.getIsbn()+"','"+book.getTitle()+"','"+book.getAuthors()+"')";

				System.out.print("saveTitlesql="+sql);
				//执行插入操作
				Statement stmt;
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				stmt.close();
				conn.close();   
		    }
	 //我写的removeTitle
	public void removeTitle(String title,String author)
				throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException{
				Connection conn=DBUtil.getConnnection();
				String sql="delete from t_book where title='"+title+"'and author='"+author+"'";
				System.out.print("removeTitlesql="+sql);	
				//执行删除操作
				Statement stmt = conn.createStatement();
				stmt.execute(sql);
				conn.close();
		
	}

}
