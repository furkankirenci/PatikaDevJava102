package MaceraOyunu;

import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);

    public void startGame(){
        System.out.print("Oyuna hosgeldiniz. Karakterinizin adi nedir? : ");
        System.out.println();
        String name;
        //name = scan.nextLine();
        Player p1 = new Player("KRALLLLL");
        System.out.println("Hosgeldin " + p1.getName() + " agam..");
        p1.selectChar();
        p1.selectLocation();

    }
}
