
package main.java.models;

import java.util.Objects;
import main.java.config.Databaseconfig;
import main.java.models.User;
import main.java.database.Database;
import main.java.app.Main;
import main.java.gui.*;

public class User {
    
    public String username;
    public String password;
    
    public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
    
    public User(String username , char []password){
     this(username,String.valueOf(password) );
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }

 
}
