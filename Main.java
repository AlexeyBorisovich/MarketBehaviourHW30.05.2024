public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Alexey");
        Human human2 = new Human("Dmitriy");
        Human human3 = new Human("Valeriy");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
