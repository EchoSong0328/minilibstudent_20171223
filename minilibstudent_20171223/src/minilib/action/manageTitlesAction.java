package minilib.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.*;
import minilib.vo.Title;

public class manageTitlesAction extends ActionSupport{
	//我写的addTitle()
	private Title book;
	
	public Title getBook() {
		return book;
	}

	public void setBook(Title book) {
		this.book = book;
	}

	public String addTitle()throws Exception {
		String restadd = INPUT;
		ManageTitlesDao mtadd = new ManageTitlesDao();
		System.out.println("====book.Title===="+book.getTitle());
		mtadd.saveTitle(book);
		restadd = "addbook";
		HttpServletRequest req=ServletActionContext.getRequest();
		req.setAttribute("message", "添加成功请继续添加！");
		System.out.println("====add===="+book.getTypeid()+book.getTitle());
		return restadd;			
		
	}
	
	public String findTitleByname()throws Exception{
	 	
		ManageTitlesDao mt = new ManageTitlesDao();
		List allTitlesList = mt.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allTitlesList", allTitlesList);
		System.out.print("====find====");
		return "querybook";
		
	}
	//我写的findBookType
	 
	public String findBookType() throws Exception{		
		String restType = INPUT;
		ManageTitlesDao mttype = new ManageTitlesDao();
		List allTypeList = mttype.findBookType();			
		HttpServletRequest request= ServletActionContext.getRequest();
		request.setAttribute("alltypelist", allTypeList);
		restType = "booktype";
		System.out.println("====findBookType====");
		return restType;
	}
	//我写的findTitles
	public String findTitles()throws Exception{
		String rest=INPUT;
		ManageTitlesDao mt=new ManageTitlesDao();
		List allTitleList=mt.findAll();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("alltitleslist", allTitleList);
		rest ="querybook";
		System.out.println("===findTitles===");
		return rest;
	 
	}
	//我写的removeTitles
	public void removeTitles(String title, String author)throws Exception{
		String remove=INPUT;
		ManageTitlesDao rm=new ManageTitlesDao();
		rm.removeTitle(title, author);
		HttpServletRequest request= ServletActionContext.getRequest();
		request.setAttribute("remove",remove);
		System.out.print("==removeTitles===");
	}	


}
