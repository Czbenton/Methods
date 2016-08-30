import sun.tools.tree.IfStatement;

public class Main {

    public static void main(String[] args) {
        System.out.println("My Weekend Plans\n");

       /* commented out for setter/getter lesson. But, these are still valid because i added a no parameter constructor.
            Car car = new Car();
            Archery archery = new Archery();
            Family family = new Family();
            Family family2 = new Family();
            IceCream iceCream = new IceCream();
            Score score = new Score();
        */
        Archery archery = new Archery(12, "Bear Kodiak Magnum Recurve", "Three Rivers rear facing quiver");
        Car car = new Car(2,2010,"ford escape",2.5);
        Family family = new Family(28,"sister");
        String[] flavors = {"blueberry", "strawberry", "vanilla"}; // this line is here to facilitate flavors in the line below
        IceCream iceCream = new IceCream(flavors, "small", "medium", "large", 5);
        Score score = new Score(80, 10, false, true);

    /* This section commented out due to setting classes to private for setter/getter lesson
        archery.arrows = 12;
        archery.bow = "Bear Kodiak Magnum Recurve";
        archery.quiver = "Three Rivers rear facing quiver";
        family.age = 22;
        family.relation = "sister";
        family2.age = 29;
        family2.relation = "wife";
        car.doors = 4;
        car.engineSize = 2.5;
        car.makeModel = "Ford Escape";
        car.year = 2010;
        iceCream.price = 5;
        iceCream.size = "small";
        iceCream.size2 = "medium";
        iceCream.size3 = "large";
        score.score = 95;
        score.targetHit = 10;
        score.firstPlace = score.score >= 97;
        score.secondPlace = score.score < 97;
*/

        archery.setArrows(15);  //wont accept more than 15 or less than 5
        System.out.println("arrows line1: " + archery.getArrows());
        System.out.println("arrows line2: " + archery.getArrows(3)); //calling the overloaded method

        car.setDoors(4);  //this has to be a 2 or 4
        System.out.println("doors line1: " + car.getDoors());
        System.out.println("doors line2: " + car.getDoors(-2)); //calling overload

        family.setRelation("wife "); //to break this and default to contructor, delete the space after wife
        System.out.println("relationship line1: " + family.getRelation());
        System.out.println("relationship line2: " + family.getRelation("beautiful ")); //calling overload

        iceCream.setFlavors("hazelnut",0);   //arrays are wierd. i do not understand fully what is happening here.
        System.out.println(iceCream.getFlavors()[0]);

        score.setScore(25);  //anything < 1 is invalid and will default to the score set at the time of creation above
        System.out.println(score.getScore());


/* This section commented out for setter/getter lesson
       System.out.println("Today I am going to an archery shoot with my " +family2.age+ " year old " +family2.relation+" and my "
        +family.age+ " year old " +family.relation+".\n");
        System.out.println("We will be taking my " +car.year+ " " +car.doors+ " door " +car.makeModel+
                " with a " +car.engineSize+ " liter engine.\n");
        System.out.println("In today's shoot, I am using my " + archery.bow + " and my " + archery.quiver+
                " will hold my " +archery.arrows+ " arrows.");
        if (score.firstPlace) {
            System.out.println("\n" + "During the shoot I did well. However I only scored one bullseye worth" + score.targetHit + " points. " +
                    "In the end, I got First Place!");
        }
        else if (score.secondPlace) {
            System.out.println("\n" + "During the shoot I did well. However I only scored one bullseye worth" + score.targetHit + " points. " +
                    "In the end, I got Second Place!");
        }
        System.out.println("\nOn the way home we decided to get ice cream. I got a " +iceCream.size2+ " " +iceCream.flavors[0] +
        ". My " +family.relation+ " and " +family2.relation+ " split a " +iceCream.size3+ " " +iceCream.flavors[2]+ ".");
*/


    }
}
