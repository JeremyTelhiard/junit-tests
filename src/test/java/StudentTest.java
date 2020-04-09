import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Test.*;
import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void testPropertiesExist(){
        Student student = new Student("Tony");
        assertNotNull(student);
        assertNotNull(student.getId());
        assertNotNull(student.getName());
        assertNotNull(student.grades);
    }

    @Test
    public void testGetStudentId(){
        Student student1 = new Student("Joey");
        Student student2 = new Student("Lisa");
        Student student3 = new Student("Brian");
        assertEquals(2, student1.getId());
        assertEquals(3, student2.getId());
        assertEquals(4, student3.getId());
    }

    @Test
    public void testGetName() {
        Student student = new Student("Gloria");
        assertEquals("Gloria", student.getName());
    }

    @Test
    public void testAddGrade(){
        Student student = new Student("Heloise");
        student.addGrade(90);
        student.addGrade(98);
        student.addGrade(90);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(90);
        expected.add(98);
        expected.add(90);

        assertEquals("Test if ArrayLists are the same", expected, student.grades);
    }

    @Test
    public void testIfStudentsAreDifferent(){
        Student student1 = new Student("Joey");
        Student student2 = new Student("Lisa");
        Student studentA = student1;
        assertNotSame(student1, student2);
        assertSame(student1, studentA);
    }

    @Test
    public void testStudentGetGradeAverage(){
        Student student = new Student("Heloise");
        student.addGrade(90);
        student.addGrade(98);
        student.addGrade(90);

        assertEquals("Test if grade average is the same", 92.67, student.getGradeAverage(), 0.01);

    }

}
