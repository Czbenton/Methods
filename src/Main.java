public class Main {

    public static void main(String[] args) {
        System.out.println("My Weekend Plans\n");


        Archery archery = new Archery(12, "Bear Kodiak Magnum Recurve", "Three Rivers rear facing quiver");
        Car car = new Car(2, 2010, "ford escape", 2.5);
        Family family = new Family(28, "sister");
        String[] flavors = {"blueberry", "strawberry", "vanilla"};
        IceCream iceCream = new IceCream(flavors, "small", "medium", "large", 5);
        Score score = new Score(80, 10, false, true);

        archery.setArrows(15);
        System.out.println("arrows line1: " + archery.getArrows());
        System.out.println("arrows line2: " + archery.getArrows(3));

        car.setDoors(4);
        System.out.println("doors line1: " + car.getDoors());
        System.out.println("doors line2: " + car.getDoors(-2));

        family.setRelation("wife ");
        System.out.println("relationship line1: " + family.getRelation());
        System.out.println("relationship line2: " + family.getRelation("beautiful "));

        iceCream.setFlavors("hazelnut", 0);
        System.out.println(iceCream.getFlavors()[0]);

        score.setScore(25);
        System.out.println(score.getScore());

    }
}
