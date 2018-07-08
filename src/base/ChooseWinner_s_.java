package base;

import java.util.ArrayList;

public class ChooseWinner_s_ {

    public ChooseWinner_s_(){}

    public int number_distance=0;
    public int h=0;
    public boolean isequalscores =false;
    public String winner;
    public int min_score=9999999;
    public int winner_score=0;

    public void distance_from_21(ArrayList<Player> jatekos)
    {
       number_distance= Math.abs(21-jatekos.get(h).score);
       jatekos.get(h).player_number_distance=number_distance;
    }

    public void is_equal_scores(ArrayList<Player> jatekos, GettingBasicDatas adatbeeski)
    {
        for (int wi=0;wi<adatbeeski.nDumb+adatbeeski.nGenius;wi++)
        {
            if(jatekos.get(wi).player_number_distance<min_score)
            {
                winner=jatekos.get(wi).name;
                winner_score=jatekos.get(wi).score;
            }
        }
        for(int p=0;p<adatbeeski.nGenius+adatbeeski.nDumb;p++)
        {
            for(int po=1;po<adatbeeski.nGenius+adatbeeski.nDumb;po++)
            {
                if((jatekos.get(p).player_number_distance==jatekos.get(po).player_number_distance)&&(p!=po))
                {

                        isequalscores = true;
                }

            }
        }
        if(isequalscores ==false)
        {
            System.out.println("1 nyertes van: "+winner+" a nyertes, "+winner_score+" ponttal.");
        }
    }

    public void show_me_the_winner(ArrayList<Player> jatekos,GettingBasicDatas adatbeeski)
    {

    }
}
