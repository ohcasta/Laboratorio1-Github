/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.Date;
import java.util.List;
/**
 *
 * @author stu
 */
public class Student {
    private long id;
    private String user;
    private String firstName;
    private String lastName;
    private Date birthDate;
//    private List<Group> attends;

    public void setId(long id) {
        this.id = id;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
//    public void setAttends(List<Group> attends) {
//        this.attends = attends;
//    }

    public long getId() {
        return id;
    }
    public String getUser() {
        return user;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
//    public List<Group> getAttends() {
//        return attends;
    
    
    public Student(long id,String user,String firstName,String lastName,Date birthDate){
        this.setId(id);
        this.setUser(user);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
//        this.setAttends(attends);
    }
    public String toString(){
        return "Estudiante Activo:"+" "+this.getFirstName()+" "+this.getLastName()+" "+this.getUser()+" Codigo:"+" "+this.getId()+" Fecha de Nacimiento:"+" "+this.getBirthDate();
                
    }
}
    
    
    
    
    
    
    
    

