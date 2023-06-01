package ro.ase.csie.cts.junit_testing;

import ro.ase.csie.cts.junit_testing.exceptions.WrongNameException;

public class Student {
    public static final int MIN_AGE = 9;
    public static final int MAX_AGE = 110;
    public static final int MIN_NAME_LENGTH = 3;
    public static final int MIN_GRADE = 0;  // absent
    public static final int MAX_GRADE = 10;

    String name;
    int age;
    int grades[];

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < Student.MIN_NAME_LENGTH) {
            throw new WrongNameException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getMinGrade() {
        if (grades.length < 1) {
            throw new UnsupportedOperationException();
        }
        return 0;
    }
}
