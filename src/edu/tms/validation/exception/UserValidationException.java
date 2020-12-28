package edu.tms.validation.exception;

import edu.tms.validation.console.input.InputData;

public class UserValidationException {
    public static final String INVALID_FIRSTNAME = "Длина имени не соответствует требованиям (минимум 3 и максимум 15 символов)";
    public static final String INVALID_LASTNAME = "Длина фамилии не соответствует требованиям (минимум 3 и максимум 15 символов)";
    public static final String INVALID_AGE = "Недопустимый возраст (допустим от 0 до 120)";
    public static final String VALID_AGE = "Возраст прошел валидацию";
}
