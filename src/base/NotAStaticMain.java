package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        int nDumb,nGenius;
        Player[] jatkos = new Player[40];
        Scanner be = new Scanner(System.in);
        System.out.print("Buta jatekosok szama:");
        nDumb = be.nextInt();
        System.out.println("\n");
        System.out.print("Okos jatekosok szama:");
        nGenius = be.nextInt();

    }
}
