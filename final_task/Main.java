package final_task;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите фамилию, имя, отчество, дату рождения, номер телефона, пол(m/f) разделенные пробелом. Пример: Ivanov Ivan Ivanovich 10.10.1993 87771234567 m");
            String input = scanner.nextLine();

            String[] inputData = input.split(" ");


            if (inputData.length != 6) {
                throw new IllegalArgumentException("Невероное количество данных");
            }

            String lastname = inputData[0];

            String firstName = inputData[1];

            String otchestvo = inputData[2];

            String birthDate = inputData[3];

            String phoneNumber = inputData[4];

            char gender = inputData[5].charAt(0);

            if (gender != 'f' && gender != 'm'){
                throw new IllegalArgumentException("неверный формат данных пола, должно быть f или m");
            }

            if (!isValidDate(birthDate)) {
                throw new IllegalArgumentException("неверный формат даты рождения, должно быть dd.mm.yyyy");
            }

            String dataToWrite = lastname + " " + firstName + " " + otchestvo + " " + birthDate + " " + phoneNumber + " " + gender;
            FileWriter fileWriter = new FileWriter(lastname + ".txt", true);
            fileWriter.write(dataToWrite + "\n");
            fileWriter.close();
            System.out.println("Данные записаны в файл " + lastname + ".txt");

        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } 


    }
    private static boolean isValidDate(String date){
        return date.matches("\\d{2}.\\d{2}.\\d{4}");
    }
}