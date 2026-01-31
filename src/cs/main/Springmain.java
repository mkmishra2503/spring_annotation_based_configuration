package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cs.bean.Stud;
import cs.repo.Stdrepo;

public class Springmain {
	public static void main(String[] args) {

        ApplicationContext a =
                new AnnotationConfigApplicationContext(Stdrepo.class);

        Stud s = (Stud) a.getBean("stud");
        s.display();
    }
}

