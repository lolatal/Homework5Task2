package edu.tms.validation.service;
import edu.tms.validation.exception.UserValidationException;
import edu.tms.validation.user.information.User;
public class UserValidationService {

    public  String validateFirstName (User user){
        String firstName = user.getFirstName();
        int firstNameLength = firstName.length();
        if (firstNameLength < 3 || firstNameLength > 15) {
            return UserValidationException.INVALID_FIRSTNAME;
        }else{
            System.out.print("Имя прошло валидацию: ");
            return firstName;
        }
    }
    public  String validateLastName (User user){
        String lastName = user.getLastName();
        int lastNameLength = lastName.length();
        if (lastNameLength < 3 || lastNameLength > 15) {
            return UserValidationException.INVALID_LASTNAME;
        }else{
            System.out.print("Фамилия прошла валидацию: ");
            return lastName;
        }
    }
    public  String validateAge (User user){
        int age = user.getAge();
        if (age<0 || age > 120) {
            return UserValidationException.INVALID_AGE;
        }else{
            return UserValidationException.VALID_AGE;
        }
    }
}

