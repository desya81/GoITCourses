package module3.home2;

/**
 * Created by denys on 21.12.15.
 */
public class Main {
    public static void main(String[] args){
        Flower Rose = new Flower("Rose");
        Flower Chamomile = new Flower("Chamomile");
        Flower Astra = new Flower("Astra");
        Bouquet Bouquet = new Bouquet();
        Bouquet.setBouquet(Rose);
        Bouquet.setBouquet(Chamomile);
        Bouquet.setBouquet(Astra);
        Bouquet.getComposition();
        Flower tulip = new Flower("Tulip");
        Flower rosebush = new Flower("Rosebush");
        Bouquet.setBouquet(tulip);
        Bouquet.setBouquet(rosebush);
        Bouquet.getComposition();
    }
}
