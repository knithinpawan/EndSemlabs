package DemoOnSpring.DemoOnSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{ 
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Collage  c1=(Collage) context.getBean("coll1");
    	Student st1=(Student) context.getBean("stud2");
    	Instructor in1 =(Instructor) context.getBean("ins");
    	Courese cou1 =(Courese) context.getBean("course1");
    	System.out.println(c1 +""+st1+""+in1);
    	System.out.println(cou1);
    }
}
