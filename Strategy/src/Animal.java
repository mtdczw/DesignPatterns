// Strategy Design Pattern
// Animal base class


// Animal: Defined a composition reference to IFlying interface
// Animal: Defined a composition reference to ISwimming interface
public class Animal {

    // Define the name of an Animal
    private String name;

    // Get/Set method for name property
    public void setName(String newName) { name = newName; }
    public String getName() { return name; }

    // Animal HAS-A Flying interface (Composition), instead inheriting from super class.
    // Allowing you to change the capabilities of object at run time.
    public IFlying flyingType;

    // Animal HAS-A Swimming interface (Composition), instead inheriting from super class.
    // Allowing you to change the capabilities of object at run time.
    public ISwimming swimmingType;

    // Animal HAS-A xxxxxx interface (Composition), instead inheriting from super class
    // Allowing you to change the capabilities of object at run time.



    // Animal pushes off the responsibility for flyingType
    public String ableToFly() {
        //
        System.out.println(this.getName() + ": " + "To show the flying type of the animal");

        return flyingType.fly();

    }

    // Animal pushes off the responsibility for swimmingType
    public String ableToSwim() {
        //
        System.out.println(this.getName() + ": " + "To show the swimming type of the animal");

        return swimmingType.swim();
    }

    // To change the flyingType dynamically, add the following method
    public void setFlyingAbility(IFlying newFlyType) {
        // Set a new fly type
        flyingType = newFlyType;
        //
        System.out.println(this.getName() + ": " + "Set to a new animal flying ability");

    }

    // To change the swimmingType dynamically, add the following method
    public void setSwimmingAbility(ISwimming newSwimType) {
        // Set a new swim type
        swimmingType = newSwimType;
        //
        System.out.println(this.getName() + ": " + "Set to a new animal swimming ability");
    }

}