// The interface is implemented by many other subclasses that allow for many types of flying
// without effecting Animal.
// Classes that implement new Flying interface, subclasses can allow other classes to use
// that code eliminating code duplication


// IFlying: I'm decoupling, encapsulating the concept that varies
// IFlying: An interface containing fly ability
public interface IFlying {
    // Define the fly interface to be overloaded.
    String fly();
}

// One Class implementing IFlying interface, which is used if the Animal can fly
class HighFlying implements IFlying {
    // Implement the animal can fly high
    public String fly() {
        return "I can fly high";
    }
}

// One Class implementing IFlying interface, which is used if the Animal can't fly
class UnableFlying implements IFlying {
    // Implement the animal can't fly
    public String fly() {
        return "I'm not flying";
    }
}

// One Class implementing IFlying interface, which is flying in lower air
class LowFlying implements IFlying {
    // Implement the animal can fly low
    public String fly() {
        return "I can fly low";
    }

}

//
class DiveFlying implements IFlying {
    //
    public String fly() { return "I can dive and fly"; }
}