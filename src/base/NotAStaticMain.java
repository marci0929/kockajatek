package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        Player[] jatekos = new Player[21];
        GiveEmAName nevetad = new GiveEmAName();
        GettingBasicDatas adatbe = new GettingBasicDatas();
        for(int i=0;i<adatbe.nDumb;i++)
        {
            jatekos[i] = new Idiot(nevetad.names[i]);
        }
        for(int i=0;i<adatbe.nGenius;i++)
        {
            jatekos[i+adatbe.nDumb] = new Genius(nevetad.names[i+adatbe.nDumb]);
        }
    }
}
