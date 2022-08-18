package com.skypro;

public class Main {

    public static void main(String[] args) {


        //Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Фамилия сотрудника - " + fullName);
        System.out.println("-------------------------");


        //Task 2
        System.out.println("Task 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("-------------------------");

        //Task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
        System.out.println("-------------------------");


        //Task 4 with substring() method
        System.out.println("Task 4");
        fullName = "Ivanov Ivan Ivanovich";
        firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        lastName = fullName.substring(fullName.indexOf("I"),fullName.indexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" "));
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println("-------------------------");


        //Task 4 with split() method
        System.out.println("Task 4");
        fullName = "Ivanov Ivan Ivanovich";
        String[] fullNamePerWord = fullName.split(" ");
        firstName = fullNamePerWord[1];
        lastName = fullNamePerWord[0];
        middleName = fullNamePerWord[2];
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println("-------------------------");


        //Task 5
        System.out.println("Task 5");
        fullName = "ivanov ivan ivanovich";
        char[] fullNameInCharArray = fullName.toCharArray();
        for (int i = 0; i < fullNameInCharArray.length; i++) {
            if (i == 0) {
                fullNameInCharArray[i] = Character.toUpperCase(fullNameInCharArray[i]);
            } else if (fullNameInCharArray[i] == ' ') {
                fullNameInCharArray[i + 1] = Character.toUpperCase(fullNameInCharArray[i + 1]);
            }
        }
        System.out.println(fullNameInCharArray);
        System.out.println("-------------------------");

    }
}
