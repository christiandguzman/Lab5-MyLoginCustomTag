
package domain_models;

/**
 *
 * @author 683676
 */
public class UserServiceLab6 {
    
    
    public static UserLab6 login(String username,String password){
        if ( username.equalsIgnoreCase("adam")
                && password.equalsIgnoreCase("password")){
            UserLab6 user = new UserLab6(username,password);
            return user;
        }else {
            return null;
        }
    }
    
}
