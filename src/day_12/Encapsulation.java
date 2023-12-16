package day_12;

public class Encapsulation {
	
	
	private String sname;
	private int sid;
	private int age;

	
	// we use get and set method encapsulation to get and set the data
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setstudentid(int sid) {
		this.sid=sid;
	}
	public int getstudentid() {
		return sid;
	}
	
	public void setstudentage(int age) {
		this.age=age;
	}
	public int getstudentage(int age) {
		return age;
	}
	
}