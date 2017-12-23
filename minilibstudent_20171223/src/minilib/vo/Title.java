package minilib.vo;
//实体类相关
public class Title {
	private String bookid;//书编号
	private String typeid;//类型编号
	private String isbn;
	private String title; //书名
	private String authors; //作者
	private String pressid; //出版社
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getPressid() {
		return pressid;
	}
	public void setPressid(String pressid) {
		this.pressid = pressid;
	}
	

}
