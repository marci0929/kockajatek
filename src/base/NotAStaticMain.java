package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        Player[] jatekos = new Player[21];
        GiveEmAName nevetad = new GiveEmAName();
        GettingBasicDatas adatbeeski = new GettingBasicDatas();
        adatbeeski.NumOfPlayers();
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            jatekos[i] = new Idiot(nevetad.names[i]);
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            jatekos[i+adatbeeski.nDumb] = new Genius(nevetad.names[i+adatbeeski.nDumb]);
        }
    }
}
