import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap hai so nguyen :");
        int a= new Scanner(System.in).nextInt();
        int b= new Scanner(System.in).nextInt();
        System.out.println("Tong cua hai so a va b : "+(a+b));
        System.out.println("Hieu cua hai so a va b : "+(a-b));
        System.out.println("Tich cua hai so a va b : "+(a*b));
        System.out.println("Thuong cua hai so a va b : "+(a*1.0/b));
        System.out.println("So du cua phep chia hai so a va b : "+(a%b));
    }
}

