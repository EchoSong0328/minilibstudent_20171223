package minilib.vo;

public class Book {
	private int id;
	private int userid;
	private int bookid;
	private int borrowdate;
	private int returndate;
	private int renewtimes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(int borrowdate) {
		this.borrowdate = borrowdate;
	}
	public int getReturndate() {
		return returndate;
	}
	public void setReturndate(int returndate) {
		this.returndate = returndate;
	}
	public int getRenewtimes() {
		return renewtimes;
	}
	public void setRenewtimes(int renewtimes) {
		this.renewtimes = renewtimes;
	}
	

}
