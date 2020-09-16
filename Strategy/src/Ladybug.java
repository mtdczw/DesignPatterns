//
//
//
//
public class Ladybug extends Animal {

    public Ladybug() {

        super();
        // Given the animal name for Eagle
        setName("Ladybug");

        // We set the Flying interface polymorphically, as a flying Animal
        flyingType = new LowFlying();
        // We set the Swimming interface polymorphically, as a swimming Animal
        swimmingType = new ShortSwimming();

        //
        System.out.println("Ladybug: One Ladybug is created");
    }


}
