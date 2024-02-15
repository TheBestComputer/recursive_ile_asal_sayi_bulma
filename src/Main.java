
import java.util.Scanner;


public class Main {
    static void asal(int a, int b){
        if(a == 1){
            System.out.println(b + " sayisi ASALDIR!");
            return;
        }else if(b % a == 0 && a != b){
            System.out.println(b + " sayisi ASAL degildir!");
            return;
        }
        asal(a - 1, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi giriniz : ");
        int a = scanner.nextInt();
        
        asal(a, a);
    }
}
