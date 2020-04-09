import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithOne.addStudent(fer);
        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
//        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

    @Test
    public void testStudentAdd(){
        Student student1 = new Student(3, "JT");
        Student student2 = new Student(4, "Johnny");
        Student student3 = new Student(5, "Jillian");
        cohortWithMany.addStudent(student1);
        cohortWithMany.addStudent(student2);
        cohortWithMany.addStudent(student3);
        assertEquals(5, cohortWithMany.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        Student expected = new Student(6, "Ptolemy");
        cohortWithMany.addStudent(expected);
        assertSame(expected, cohortWithMany.getStudents().get(2));
        System.out.println(cohortWithMany.getStudents().get(2).getId());
    }

    @Test
    public void testCohortAverage(){
        System.out.println(cohortWithMany.getCohortAverage());
        Student willy = new Student(7, "Willy");
        willy.addGrade(100);
        willy.addGrade(95);
        willy.addGrade(90);
        cohortWithMany.addStudent(willy);
        assertEquals(95, cohortWithMany.getCohortAverage(), 0.1);
    }

}