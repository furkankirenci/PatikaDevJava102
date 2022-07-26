package MaceraOyunu;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;

    public Player(String name) {
        this.name = name;
    }

    Scanner scan = new Scanner(System.in);

    public void selectChar() {
        Gamecharacters[] Characters = {new Samurai(), new Archer(), new Knight()};
        System.out.println("------------------------------------------------------------------------------------");
        for (Gamecharacters i : Characters) {
            System.out.println("ID : " + i.getId() +
                    "\t Karakter : " + i.getName() +
                    "\t\t Hasari : " + i.getDamage() +
                    "\t\t Cani : " + i.getHealth() +
                    "\t\t Parasi : " + i.getMoney());
        }
        System.out.println("------------------------------------------------------------------------------------");
        int id = 0;
        while (id < 1 || id > 3) {
            System.out.print("Lutfen bir ID seciniz : ");
            id = scan.nextInt();
            if (id < 1 || id > 3) {
                System.out.println("Gecerli bir ID giriniz");
            }
        }

        switch (id) {
            case 1:
                initChar(new Samurai());
                break;
            case 2:
                initChar(new Archer());
                break;
            case 3:
                initChar(new Knight());
                break;
        }
        System.out.println("Karakteriniz : " + this.getCharName() + "\tHasari : " + this.getDamage() + "\tCani : " + this.getHealth());
    }

    //Karakter seçme Fonksiyonu
    public void initChar(Gamecharacters gamer) {
        this.setDamage(gamer.getDamage());
        this.setHealth(gamer.getHealth());
        this.setMoney(gamer.getMoney());
        this.setCharName(gamer.getName());
    }

    public void selectLocation(){
        Location loc;
        System.out.println("Bolgeler;");
        System.out.println("1 - Guvenli Ev");
        System.out.println("2 - Magaza");
        System.out.print("Lutfen Bolge Seciniz : ");
        int selectedLoc = scan.nextInt();
        System.out.println("------------------------------------------------------------------------------------");

        switch (selectedLoc){
            case 1:
                loc = new Safehouse(this);
                break;
            case 2:
                loc = new ToolStore(this);
                break;
            default:
                System.out.println("Varsayilan olarak guvenli eve gonderildiniz...");
                loc = new Safehouse(this);
        }
        loc.onLocation();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}



