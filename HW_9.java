package HomeWork_9;

import java.util.Scanner;

public class HW_9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите разрядность массива (валиден только вариант 4*4): ");
        int a = scanner.nextInt();
        String array[][] = new String[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[j][i] = String.valueOf(counter); counter++;
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
  //      array[2][3] = "Строка"; //Хардкод для обработки NumberFormatException

        System.out.println("Сумма всех элеменнов массива: " + newArray(array));

    }

    public static int newArray(String[][] array) {
        int summ=0;
        if (array.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    Integer.valueOf(array[j][i]);
                } catch (NumberFormatException e) {
                    System.out.printf("В %d строке и в %d колонке не числовое значение: %s",j,i,array[j][i]);
                    throw new MyArrayDataException();
                }
                summ += Integer.parseInt(array[j][i]);

            }
        }
        return summ;

    }
}
