package base;

import java.util.Scanner;

public class GettingBasicDatas {
    public int nDumb=0;
    public int nGenius=0;
    public GettingBasicDatas(){}

    public void NumOfPlayers()
    {
        Scanner be = new Scanner(System.in);
        System.out.print("Buta jatekosok szama:");
        nDumb = be.nextInt();
        System.out.println("\n");
        System.out.print("Okos jatekosok szama:");
        nGenius = be.nextInt();
    }
}
