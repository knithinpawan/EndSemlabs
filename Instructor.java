package DemoOnSpring.DemoOnSpring;

public class Instructor {
private int instutor_id;
private String name;
private String email;
private Long phone;
public int getInstutor_id() {
	return instutor_id;
}
public void setInstutor_id(int instutor_id) {
	this.instutor_id = instutor_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
Instructor(int instutor_id,String name,String email,Long phone ){
	super();
	this.instutor_id=instutor_id;
	this.name=name;
	this.phone=phone;
	this.email=email;
	
}
public String toString() {
    return "Instructor [instutor_id=" + instutor_id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
}
}
