/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_models;

/**
 *
 * @author 683676
 */
public class UserLab6 {
    
    private String username;
    private String password;
    
    public UserLab6(){
        
    }
    
    public UserLab6(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
       return username;
    }
    
    public void setUsername(String username){
       this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
