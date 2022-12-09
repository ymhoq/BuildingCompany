package People;

import java.util.Objects;

import Exeptions.*;
import Interfaces.IMessege;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public abstract class Person implements IMessege {

    private static final Logger L= LogManager.getLogger(Person.class);
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;

    public Person() {
    }
    public Person(String firstName, String lastName, int age, String phoneNumber, String email) throws IncorrectDataExсeption {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws PersonNameExсeption {
        if(firstName.length()>20) { L.error(new PersonNameExсeption());
            throw new PersonNameExсeption();}
        else this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws PersonLastNameExсeption {
        if(firstName.length()>20) throw new PersonLastNameExсeption();
        else this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonAgeExсeption {
        if(age<18||age>120) throw new PersonAgeExсeption();
        else this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws PersonPhoneExсeption {
        if (phoneNumber.length()>10||phoneNumber.matches("[.|(){^?*+]")) {
            L.error( new PersonPhoneExсeption());
        }
        else this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws PersonEmailExсeption {
    if(email.matches("[]]")) this.email = email;
    else L.error(new PersonEmailExсeption());

    }
    public String toString() {
        return "firstname : " + firstName + "\n"
                + "lastname : " + lastName + "\n";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person that = (Person) o;
        return Objects.equals(this.lastName, that.lastName) && Objects.equals(this.getFirstName(), that.getFirstName());
    }

    public int hashCode() {
        int result = 1;

        result = 17 * result + (lastName == null ? 0 : lastName.hashCode())
                + (firstName == null ? 0 : firstName.hashCode())
                + (email == null ? 0 : email.hashCode());
        return result;
    }
}
