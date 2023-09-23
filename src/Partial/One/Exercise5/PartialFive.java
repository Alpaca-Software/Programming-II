package coco77.partialfive;

/**
 * "5. You must create a list of 3 students through the keyboard, request the
 * following data: name, document and age. You must average the age."
 */
public class PartialFive {

    public static void main(String[] args) {

        String documet;
        String name;
        int age;
        
            Student student[] = new Student[3];
        student[0] = new Student("1049019577", "felipe", 18);
        student[1] = new Student("104901977", "Pinto", 12);
        student[2] = new Student("104901977", "Pinto", 89);

        Student.calculateAverageAge(student, student.length);
        
        System.out.println("the average the los student is the: "+Student.average);
    }
}
