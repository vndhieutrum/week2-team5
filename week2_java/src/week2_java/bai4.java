import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi ban nhap so tien gui:");
        int tien = sc.nextInt();
        System.out.println("Xin moi ban nhap lai xuat ngan hang:");
        double lxuat = sc.nextDouble();
        System.out.println("Xin moi ban nhap so thang can gui:");
        int thang =  sc.nextInt();
        double lai = tien * (lxuat/12) * thang ;
        System.out.println("Lai trong 1 thang la:" +lai);
        double lainthang = lai * thang ;
        System.out.println("Lai sau so thang gui la:" +lainthang);
        double tong = tien + lainthang ;
        System.out.println("Vay tong tien la:" + tong);
    }
    
}