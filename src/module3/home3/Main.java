package module3.home3;

/**
 * Created by denys on 21.12.15.
 */
public class Main {

    public static void main(String[] args){
        MusicInstrument Guitar = new MusicInstrument("Guitar");
        MusicInstrument Piano = new MusicInstrument("Piano");
        MusicInstrument Trumpet = new MusicInstrument("Trumpet");
        MusicShop shop = new MusicShop("Closed");
        shop.setItem(Guitar);
        shop.setItem(Piano);
        shop.setItem(Trumpet);
        shop.setShopState("Open");
        shop.startWork();

    }

}
