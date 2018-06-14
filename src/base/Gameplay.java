package base;

import java.util.ArrayList;

public class Gameplay {
    public Gameplay(){}

    public void flow_of_game(GettingBasicDatas adatbeeski, ArrayList<Player> jatekos, ArrayList<Player> buta, ArrayList<Player> okos)
    {
        for(int i=0;i<adatbeeski.num_of_turns;i++)
        {
            System.out.println(jatekos.get(i).score);
        }
    }
}
