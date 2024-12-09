package DemoOnSpring.DemoOnSpring;

public class Courese {
private int courseid;
private String courese_name;
private String credits;
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCourese_name() {
	return courese_name;
}
public void setCourese_name(String courese_name) {
	this.courese_name = courese_name;
}
public String getCredits() {
	return credits;
}
public void setCredits(String credits) {
	this.credits = credits;
}
public Courese(int courseid,String coursese_name,String credits){
	super();
	this.courese_name=coursese_name;
	this.courseid=courseid;
	this.credits=credits;
}
public String toString() {
    return "Courese [courseid=" + courseid + ", course_name=" + courese_name + ", credits=" + credits + "]";
}
}
