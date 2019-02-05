package Steps;

import java.util.Scanner;

public class ekindeneme {
    public  ekindeneme(){
        Scanner kb =new Scanner(System.in);
        System.out.println("Ekrandaki şifreyi giriniz:");
        int sifre = kb.nextInt();
        System.out.println("girilen şifre " + sifre);
        kb.close();

    }
    public static void main (String[] args) {
       new ekindeneme();
    }
}
