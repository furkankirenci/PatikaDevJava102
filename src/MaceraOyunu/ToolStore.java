package MaceraOyunu;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Magazaya Hosgeldiniz");
        return true;
    }
}
