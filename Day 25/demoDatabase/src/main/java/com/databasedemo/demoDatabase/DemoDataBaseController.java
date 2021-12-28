package com.databasedemo.demoDatabase;

import com.databasedemo.demoDatabase.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DemoDataBaseController {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/")
    public String home(){
        Student student1 = new Student("Athira", "1A", 57.00f, 22, "9876543210");
        studentService.saveStudent(student1);
        return "Home Page";
    }

    /*
    @GetMapping --> common, less data
    @PostMapping --> sensitive, large data
    @PutMapping
    @PatchMapping

    Request mapping is always a get mapping,
    get mapping not that secured, post mapping is more security-->data will be embedded in http header
    get mapping --> non sensitive data, for sensitive data like password we go with post mapping
     */

    @RequestMapping("/create")
    public Student create(HttpServletRequest request){ //httpservletreq --> to get values from the url
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Student student = new Student(name, "2A", 88.00f,22,phone);
        return studentService.saveStudent(student);//this part is jpa
    }

    @RequestMapping("/list")
    public List<Student> list(){
        return studentService.listAll();
    }

}

/*server.port = 4000
spring.datasource.url = jdbc:mysql://localhost:3306/studentDB
spring.datasource.username = root
spring.datasource.password = root
spring.jpa.properties.hibernate.dialect = org.hibernate.dialectMySQLDialect
spring.jpa.hibernate.ddl-auto = create-drop  #the db will be created and dropped at every run
spring.jpa.show-sql = true # to print sql comments in terminal
spring.jpa.properties.hibernate.format_sql = true #to print sql comments in clear/neat format


server.port=4000
spring.datasource.url=jdbc:mysql://localhost:3306/students
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port = 4000
spring.datasource.url = jdbc:mysql://localhost:3306/students
spring.datasource.username = root
spring.datasource.password = root
spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql = true
 */