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
        Location loc;

        while (true){
            System.out.println("Bolgeler;");
            System.out.println("1 - Guvenli Ev");
            System.out.println("2 - Magaza");
            System.out.print("Lutfen Bolge Seciniz : ");
            int selectedLoc = scan.nextInt();
            System.out.println("------------------------------------------------------------------------------------");

            switch (selectedLoc){
                case 1:
                    loc = new Safehouse(p1);
                    break;
                case 2:
                    loc = new ToolStore(p1);
                    break;
                default:
                    System.out.println("Varsayilan olarak guvenli eve gonderildiniz...");
                    loc = new Safehouse(p1);
            }
            boolean isContinue = loc.onLocation();
            if (!isContinue){
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
