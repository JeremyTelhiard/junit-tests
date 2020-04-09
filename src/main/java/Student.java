import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    ArrayList<Integer> grades;
    static long counter;

    public Student(String n) {
        counter++;
        this.name = n;
        this.id = counter;
        grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double gradeAdd = 0;
        for(double grade : grades){
            gradeAdd += grade;
        }
        return (gradeAdd / grades.size());
    }

}
