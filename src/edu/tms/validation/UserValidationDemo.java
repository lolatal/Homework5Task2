package edu.tms.validation;

import edu.tms.validation.console.input.InputData;
import edu.tms.validation.exception.UserValidationException;
import edu.tms.validation.service.UserValidationService;
import edu.tms.validation.user.information.User;


public class UserValidationDemo {
    public static void main(String[] args) {

        String firstName = InputData.getString("Введите ваше имя");
        String lastName = InputData.getString("Введите вашу фамилию");
        int age = InputData.getInt("Введите ваш возраст");
        User user = new User(firstName, lastName, age);
        UserValidationService validationService = new UserValidationService();
        System.out.println(validationService.validateFirstName(user));
        System.out.println(validationService.validateLastName(user));
        System.out.println(validationService.validateAge(user));
    }
}