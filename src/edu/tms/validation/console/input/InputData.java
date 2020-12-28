package edu.tms.validation.console.input;
import java.util.Scanner;

public class InputData {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        String inputData = scanner.nextLine();
        if(inputData.isBlank()) {
            System.out.println("Вы ввели пустую строку, попробуйте еще раз");
            getString();
        }
        return inputData;
    }
    public static String getString(String message){
        System.out.println(message);
        return getString();
    }

    public static int getInt() {
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        System.out.println(String.format("Ввод [%s] не является числом. Попробуйте еще раз", scanner.next()));
        return getInt();
    }
    public static int getInt (String message) {
        System.out.println(message);
        return getInt();
    }
}

