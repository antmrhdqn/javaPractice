package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

public class Run {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("홍길동", 20, 178.2,70,1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3,80,2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0,45,4, "정보통신공학");

        for (Student stu : students) {
            System.out.println(stu.information());
        }

        Employee employee = new Employee();

        while (true) {

        }

    }

}
