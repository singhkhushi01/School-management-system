package com.project;
import com.project.config.Appconfig;
import com.project.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class New_project {
    public static void main(String args[]){
//        CourseService service = new CourseService();
//        System.out.println(service.list());

//        or
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        CourseService service = applicationContext.getBean("Khushi", CourseService.class);
        System.out.println(service.list());
    }
}
