package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        Player[] jatekos = new Player[21];
        GiveEmAName nevetad = new GiveEmAName();
        GettingBasicDatas adatbeeski = new GettingBasicDatas();
        adatbeeski.NumOfPlayers();
        MakeThePlayers(jatekos, nevetad, adatbeeski);
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            System.out.print(jatekos[i].name);
        }
    }

    private void MakeThePlayers(Player[] jatekos, GiveEmAName nevetad, GettingBasicDatas adatbeeski) {
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            jatekos[i] = new Idiot();
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            jatekos[i+adatbeeski.nDumb] = new Genius();
        }
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            jatekos[i].name = nevetad.names[i];
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            jatekos[i+adatbeeski.nDumb+1].name = nevetad.names[i+adatbeeski.nDumb+1];
        }
    }
}
