package base;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        int nDumb,nGenius;
        Player[] jatekos = new Player[21];
        GettingBasicDatas adatbe = new GettingBasicDatas();
        for(int i=0;i<adatbe.nDumb;i++)
        {
            jatekos[i]= new Idiot();
        }

    }
}
