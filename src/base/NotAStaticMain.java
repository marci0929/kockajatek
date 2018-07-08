package base;
import java.util.ArrayList;
import java.util.Scanner;

public class NotAStaticMain{
    public NotAStaticMain(){}

    public void RunTheGame(){
        ArrayList<Player> jatekos = new ArrayList<>();
        GiveEmAName nevetad = new GiveEmAName();
        GettingBasicDatas adatbeeski = new GettingBasicDatas();
        adatbeeski.NumOfPlayers();
        Idiot buta = new Idiot();
        ChooseWinner_s_ nyertes = new ChooseWinner_s_();
        Genius okos = new Genius();
        PlayerMaker playerMaker = new PlayerMaker();
        playerMaker.MakeThePlayers(jatekos, nevetad, adatbeeski);

        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            System.out.print(jatekos.get(i).name+",");
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            System.out.print(jatekos.get(i+adatbeeski.nDumb).name+",");
        }
        System.out.print("jatszik.");
        Gameplay jatek = new Gameplay();
        jatek.flow_of_game(adatbeeski,jatekos,nyertes);
    }


}
