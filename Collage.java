package DemoOnSpring.DemoOnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Collage {
String cname;
@Autowired
@Qualifier("stud2")
Student stud;
 
 
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}
Collage(){
	
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Collage [cname=" + cname + ", stud=" + stud + "]";
}
 
}
