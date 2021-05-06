
package hafta3;

public class UserManager {
    public void add(User user){
        System.out.println(user.getName()+"registered.");
    }
        
    public void addMultiple(User[] users){
        for(User user:users){
            add(user);
        }
    }
        
    
     public void delete(User _user){
        System.out.println(_user.getName()+" "+_user.getLastname()+" user deleted.");
    }
    
}
