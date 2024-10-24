/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author labso20
 */
public class Person {
    private int personId;
    private String personName;
    private String personLastName;
    private String personGroup;

    public Person(String personName, String personLastName, String personGroup) {
        this.personName = personName;
        this.personLastName = personLastName;
        this.personGroup = personGroup;
    }

    public Person(int personId, String personName, String personLastName, String personGroup) {
        this.personId = personId;
        this.personName = personName;
        this.personLastName = personLastName;
        this.personGroup = personGroup;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonGroup() {
        return personGroup;
    }

    public void setPersonGroup(String personGroup) {
        this.personGroup = personGroup;
    }
}
