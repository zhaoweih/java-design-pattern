package com.zhaoweihao.observe;

public class Client {
    public static void main(String args[]) {
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("marvel super hero");

        Player player1,player2,player3,player4;

        player1 = new Player("iron man");
        acc.join(player1);

        player2 = new Player("spider man");
        acc.join(player2);

        player3 = new Player("captain america");
        acc.join(player3);

        player4 = new Player("thor");
        acc.join(player4);

        player1.beAttacked(acc);


    }
}
