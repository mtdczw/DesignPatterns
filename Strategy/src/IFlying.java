// The interface is implemented by many other subclasses that allow for many types of flying
// without effecting Animal.
// Classes that implement new Flying interface, subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies
public interface IFlying {
    // Define the fly interface to be overloaded.
    String fly();
}

// One Class implementing IFlying interface, which is used if the Animal can fly
class HighFlying implements IFlying {
    // Implement the animal can fly
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
    //
    public String fly() {
        return "I can fly low";
    }

}