package com.example.repotest.repository;

import com.example.repotest.entity.Student;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;


//for testing we use dummy db
//normal db stored in hard disk --> Permanent
//in-memory db stores in main memory(RAM-->Temporary)
//Access data from ram is fast, and access data from hd is slow
//add dependency in pom
//create new dir resources in test and application properties in test

@DataJpaTest //else it will throw "this.this$0.studentRepository" is null error
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Nested
    class ChecksIfEmailExistsOrNot{
        @BeforeEach
        public void setup(){
            Student athira = new Student("Athira", "athira123@gmail.com", 22);
            studentRepository.save(athira);
        }

        @AfterEach
        public void tearDown(){
            studentRepository.deleteAll();
        }
        @Test
        public void returnsTrueIfEmailExists(){
            Boolean actualValue = studentRepository.existsByEmail("athira123@gmail.com");
            Assertions.assertTrue(actualValue);
        }

        @Test
        @Disabled
        public void returnsTrueIfEmailExistsDemo(){
            Student athira = new Student("Athira", "athira123@gmail.com", 22);
            studentRepository.save(athira);
            Boolean actualValue = studentRepository.existsByEmail("athira123@gmail.com");
            Assertions.assertTrue(actualValue);
        }

        @Test
        public void returnsFalseIfEmailNotExists(){
            Boolean actualValue = studentRepository.existsByEmail("bhavya123@gmail.com");
            Assertions.assertFalse(actualValue);
        }

//        Why after each?
//        @Test
//        public void changeData(){
//            Student athira = studentRepository.findById(1l).get();
//            athira.setEmail("athira456@gmail.com");
//            studentRepository.save(athira);
//        }

    }
}