
package hafta3;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.studentNumber+" student added.");
    }
    
    
    public void addMultiple(Student[] students){
        for(Student student : students){
            add(student);
        }
    }
}
