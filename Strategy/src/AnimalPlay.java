// Strategy Design Pattern
//
//
// To test the animal class for its fly interface
public class AnimalPlay {

    public static void main(String[] args){
        // To create one Horse and one Eagle object
        Animal aHorse = new Horse();
        Animal aEagle = new Eagle();
        Animal aLadybug = new Ladybug();
        System.out.println();
        // Show off the flying type of the Horse, Eagle, Ladybug objects.
        System.out.println(aHorse.getName() +": " + aHorse.ableToFly());
        System.out.println(aEagle.getName() +": " + aEagle.ableToFly());
        System.out.println(aLadybug.getName() +": " + aLadybug.ableToFly());
        System.out.println();

        // This allows dynamic changes for flyingType
        aHorse.setFlyingAbility(new HighFlying());
        System.out.println(aHorse.getName() +": " + aHorse.ableToFly());
        aEagle.setFlyingAbility(new UnableFlying());
        System.out.println(aEagle.getName() +": " + aEagle.ableToFly());
        aLadybug.setFlyingAbility(new HighFlying());
        System.out.println(aLadybug.getName() +": " + aLadybug.ableToFly());
        System.out.println();

        //
        // Show off the swimming type of the Horse, Eagle, Ladybug objects.
        System.out.println(aHorse.getName() +": " + aHorse.ableToSwim());
        System.out.println(aEagle.getName() +": " + aEagle.ableToSwim());
        System.out.println(aLadybug.getName() +": " + aLadybug.ableToSwim());
        System.out.println();

        // This allows dynamic changes for swimmingType
        aHorse.setSwimmingAbility(new UnableSwimming());
        System.out.println(aHorse.getName() +": " + aHorse.ableToSwim());
        aEagle.setSwimmingAbility(new LongSwimming());
        System.out.println(aEagle.getName() +": " + aEagle.ableToSwim());
        aLadybug.setSwimmingAbility(new ShortSwimming());
        System.out.println(aLadybug.getName() +": " + aLadybug.ableToSwim());

    }

}