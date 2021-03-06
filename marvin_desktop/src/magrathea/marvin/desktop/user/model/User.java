/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magrathea.marvin.desktop.user.model;

import java.util.Objects;

/**
 *
 * @author boscalent
 */
public class User {
    
    private long id;
    private String nickname;
    private String password;  // only for user of the app
    private String email;
    private boolean administrator;
    
    /*
    private final SimpleLongProperty id;
    private final SimpleStringProperty nickname;
    private final SimpleStringProperty password;
    private final SimpleStringProperty email;
    private final SimpleBooleanProperty administrator;
    
    private User(long id, String nickname, String password, String email, boolean administrator){
        this.id = new SimpleLongProperty(id);
        this.nickname = new SimpleStringProperty(nickname);
        this.password = new SimpleStringProperty(password);
        this.email = new SimpleStringProperty(email);
        this.administrator = new SimpleBooleanProperty(administrator);
    }
*/
    
    public User(){
    }
    
    // Equals & HashCode
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nickname);
        hash = 59 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User{id=");
        builder.append(id); 
        builder.append(", nickname=");
        builder.append(nickname); 
        builder.append(", password=");
        builder.append(password); 
        builder.append(", email=");
        builder.append(email); 
        builder.append(", administrator=");
        builder.append(administrator); 
        builder.append('}');
        return builder.toString();
    }
    
 
    // Getters & Setters
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    
    public String getNickname() {return nickname;}
    public void setNickname(String nickname) {this.nickname = nickname;}
    
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    
    public boolean isAdministrator() {return administrator;}
    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;}   
    
}
