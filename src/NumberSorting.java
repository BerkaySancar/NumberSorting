import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        //Kullanıcıdan aldığımız üç sayıyı küçükten büyüğe sıralama.
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;
        System.out.print("1. Sayı: ");
        firstNumber = input.nextInt();
        System.out.print("2. Sayı: ");
        secondNumber = input.nextInt();
        System.out.print("3. Sayı: ");
        thirdNumber = input.nextInt();

        if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            if (secondNumber < thirdNumber) {
                System.out.print(firstNumber + "<" + secondNumber + "<" + thirdNumber);
            } else {
                System.out.print(firstNumber + "<" + thirdNumber + "<" + secondNumber);
            }
        } else if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
            if ((firstNumber < thirdNumber)) {
                System.out.print(secondNumber + "<" + firstNumber + "<" + thirdNumber);
            } else {
                System.out.print(secondNumber + "<" + thirdNumber + "<" + firstNumber);
            }
        } else {
            if (secondNumber < firstNumber) {
                System.out.print(thirdNumber + "<" + secondNumber + "<" + firstNumber);
            } else {
                System.out.print(thirdNumber + "<" + firstNumber + "<" + secondNumber);
            }
        }
    }
}
