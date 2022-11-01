package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    double r,a;
        System.out.println("dairenin yaricapini giriniz:");
        r=scanner.nextDouble();
        System.out.println("merkez acinin olcusunu  giriniz:");
        a=scanner.nextDouble();
        double daireDilimiAlani=(3.14*(r*r)*a)/360;
        System.out.println("Daire diliminin Alani:"+daireDilimiAlani);


    }
}
