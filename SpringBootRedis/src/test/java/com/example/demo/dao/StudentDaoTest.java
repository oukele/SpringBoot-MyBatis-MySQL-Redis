package com.example.demo.dao;

import com.example.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentDaoTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void getList(){
        System.out.println(studentMapper.selectAll());
    }

    @Test
    public void getStudent(){
        Student student = studentMapper.getStudent("AAAAA1");

        System.out.println( student.toString() );

    }

    @Test
    public void insert() {

        Student student = new Student();
        student.setNumbercode("AAAAA1");
        student.setStuname("欧可乐");
        student.setStuage(20);
        student.setStusex("男");

        System.out.println(studentMapper.insert(student));

    }

    @Test
    public void update() {

        Student student = new Student();
        student.setNumbercode("AAAAA1");
        student.setStuname("欧可乐_修改");
        student.setStuage(18);
        student.setStusex("男");

        System.out.println(studentMapper.update(student));

    }

    @Test
    public void delet() {
        System.out.println(studentMapper.delete("AAAAA1"));
    }

}
