package base;

import java.util.ArrayList;

public class PlayerMaker {

    public void MakeThePlayers(ArrayList<Player> jatekos, GiveEmAName nevetad, GettingBasicDatas adatbeeski) {
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            jatekos.add(new Idiot());
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            jatekos.add(i+adatbeeski.nDumb,new Genius());
        }
        for(int i=0;i<adatbeeski.nDumb;i++)
        {
            jatekos.get(i).name = nevetad.names[i]+" (buta)";
        }
        for(int i=0;i<adatbeeski.nGenius;i++)
        {
            jatekos.get(i+adatbeeski.nDumb).name = nevetad.names[i+adatbeeski.nDumb+1]+" (okos)";
        }

    }
}
