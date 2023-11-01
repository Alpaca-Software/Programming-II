
package partial.two.exercise7;
import java.util.List;
import java.util.ArrayList;

public class Exercise7 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("felipe",5.0f,5.0f,5.0f,5.0f));
        students.add(new Student("Andrey",5.0f,5.0f,5.0f,5.0f));
        students.add(new Student("Pinto",5.0f,5.0f,5.0f,5.0f));
        students.add(new Student("Uribe",1.0f,1.0f,1.0f,5.0f));
        students.add(new Student("felipe",5.0f,5.0f,5.0f,5.0f));
        
        Student.checkIfItPassed(students);
    }
}
