package Model;

public class Student {
	private int stuNo;
	private String stuName;
	private String stuId;
	public Student() {
		// TODO Auto-generated constructor stub
		
	}
	public Student(int stuNo, String stuName, String stuId) {
		// TODO Auto-generated constructor stub
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stuNo+"/"+stuName+"/"+stuId;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
}
