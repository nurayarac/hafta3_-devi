
package hafta3;

public class Main {
    public static void main(String[] args) {
        Instructor instructor= new Instructor();
        instructor.setName("Engin");
        
        User user = new User();
        user.setName("Nuray");
        
        Student student = new Student();
        student.setName("İrem");
        
        UserManager userManager= new UserManager();
        User[] users={};
        userManager.addMultiple(users);
        
        
        
    }
    
    
}
