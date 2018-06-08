package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        Player[] jatekos = new Player[21];
        GiveEmAName nevetad = new GiveEmAName();
        GettingBasicDatas adatbeeski = new GettingBasicDatas();
        adatbeeski.NumOfPlayers();
        PlayerMaker playerMaker = new PlayerMaker();
        playerMaker.MakeThePlayers(jatekos, nevetad, adatbeeski);
        
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            System.out.print(jatekos[i].name+",");
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            System.out.print(jatekos[i+adatbeeski.nDumb].name+",");
        }
        System.out.print("jatszik.");
    }


}
