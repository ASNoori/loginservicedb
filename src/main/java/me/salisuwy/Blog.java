package me.salisuwy;

import javax.persistence.*;

@Entity
@Table(name = "logging")
public class Blog {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="username")
    private String username;
    @Column(name="password")

   
    private String password;

    public Blog() {  }

    public Blog(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public Blog(int id, String username, String password) {
        this.setId(id);
        this.setUsername(username);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

