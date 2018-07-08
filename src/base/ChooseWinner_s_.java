package base;

import java.util.ArrayList;

public class ChooseWinner_s_ {

    public ChooseWinner_s_(){}

    public int number_distance=0;
    public int h=0;
    boolean isonewinner=true;

    public void distance_from_21(ArrayList<Player> jatekos)
    {
       number_distance= Math.abs(21-jatekos.get(h).score);
       jatekos.get(h).player_number_distance=number_distance;
    }

    public void is_one_winner(ArrayList<Player> jatekos,GettingBasicDatas adatbeeski)
    {
        for(int p=0;p<adatbeeski.nGenius+adatbeeski.nDumb;p++)
        {
            for(int po=1;po<adatbeeski.nGenius+adatbeeski.nDumb;po++)
            {
                if((jatekos.get(p).player_number_distance==jatekos.get(po).player_number_distance)&&(p!=po))
                {
                    isonewinner=false;
                    System.out.println("Tobb nyertes van");
                    break;
                }
            }
        }
        if(isonewinner==true)
        {
            System.out.println("1 nyertes van");
        }
    }
}
