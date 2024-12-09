package DemoOnSpring.DemoOnSpring;

public class Student {
 
public Student(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
int id;
String sname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [id=" + id + ", sname=" + sname + "]";
}
}
