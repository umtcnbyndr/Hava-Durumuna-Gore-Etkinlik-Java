import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input=new Scanner(System.in);

        System.out.print("Havanın kaç derece olduğunu giriniz:");
        sicaklik=input.nextInt();

        if (sicaklik<5){
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        } else if (sicaklik>5 &&  sicaklik<15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (sicaklik>15 && sicaklik<25) {
            System.out.print("Piknik yapmaya gidebilirsiniz");
        } else if (sicaklik>25) {
            System.out.print("Sahile yüzmeye gidebilirsiniz.");
        }
    }
}
