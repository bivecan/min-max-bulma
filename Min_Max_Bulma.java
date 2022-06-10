import java.util.Scanner;

public class Min_Max_Bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane sayı gireceksiniz: ");
        int adet = input.nextInt();

        int number; int big; int small; int first;

        System.out.println("1. sayıyı giriniz: ");
        first = input.nextInt();
        big = first;
        small= first;

        if (adet>1) {
            for (int i = 2; i <= adet; i++) {
                System.out.println(i + ". sayıyı giriniz: ");
                number = input.nextInt();

                if (number > big) {
                    big = number;
                }

                if (number < small) {
                    small = number;
                }
            }
        }

        System.out.println("en buyuk: " + big);
        System.out.println("en kucuk: " + small);
    }
}
