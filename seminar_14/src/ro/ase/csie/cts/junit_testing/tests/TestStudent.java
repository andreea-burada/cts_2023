package ro.ase.csie.cts.junit_testing.tests;

import org.junit.*;
import ro.ase.csie.cts.junit_testing.Student;
import ro.ase.csie.cts.junit_testing.exceptions.WrongNameException;

import static org.junit.Assert.*;

public class TestStudent {
    // test fixture
    private static Student student;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        student = new Student("Joe Doe", 20);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void testSetNameConformanceRight() {
        String newName = "John";
        String expectedName = newName;

        student.setName(newName);

        assertEquals(expectedName, student.getName());
    }

    @Test(expected = WrongNameException.class)
    public void testSetNameConformanceError() {
        String newInvalidName = "Jo";
        // JUnit 3 way of testing for errors
//        try {
//            student.setName(newInvalidName);
//            fail("We do not get the exception");
//        } catch (WrongNameException ex) {
//            assertTrue(true);
//        }

        // JUnit 4 way of testing for errors -> see annotation
        // add expected attribute with the class of the exception
        student.setName(newInvalidName);
    }

    @Test
    public void testGetMinGradeOrderingDescending() {
        int grades[] = {10, 10, 9, 5};
        student.setGrades(grades);

        int expectedResult = 5;

        int minGrade = student.getMinGrade();

        assertEquals(expectedResult, minGrade);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMinGradeCardinalityZero() {
        int grades[] = {};
        student.setGrades(grades);

        student.getMinGrade();
    }

    @Test
    public void testGetMinGradeCardinalityOne() {
        int grades[] = {10};
        student.setGrades(grades);

        int expectedResult = grades[0];

        int minGrade = student.getMinGrade();

        assertEquals(expectedResult, minGrade);
    }
}
