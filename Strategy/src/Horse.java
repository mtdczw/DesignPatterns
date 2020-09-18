// Strategy Design Pattern
// Horse class inherited from Animal


// Horse: Initialized several properties of Animal class
// Horse: Defined flying type and swimming type
public class Horse extends Animal {

    // The constructor initializes Horse objects
    public Horse(){
        //
        super();
        // Given the animal name for Horse
        setName("Horse");

        // We set the Flying interface polymorphically, as a non-flying Animal
        flyingType = new UnableFlying();
        // We set the Swimming interface polymorphically, as a swimming Animal
        swimmingType = new LongSwimming();

        //
        System.out.println("Horse: One horse is created");

    }

}