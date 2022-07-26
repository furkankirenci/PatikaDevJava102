package MaceraOyunu;

public class Safehouse extends NormalLocation {

    public Safehouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Guvenli evdesiniz");
        System.out.println("Caniniz Yenilendi" );
        return true;
    }

}
