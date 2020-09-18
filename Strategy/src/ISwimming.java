// The interface is implemented by many other subclasses that allow for many types of Swimming
// without effecting Animal.
// Classes that implement new Swimming interface, subclasses can allow other classes to use
// that code eliminating code duplication


// ISwimming: I'm decoupling, encapsulating the concept that varies
// ISwimming: An interface containing swim ability
public interface ISwimming {
    // Define the swim interface to be overloaded
    public String swim();
}

// One Class implementing ISwimming interface, which is used if the Animal can swim long
class LongSwimming implements ISwimming {
    // Implement the animal can swim long
    public String swim() {
        return "I can swim long";
    }
}

// One Class implementing ISwimming interface, which is used if the Animal can swim short
class ShortSwimming implements ISwimming {
    // Implement the animal can swim short
    public String swim() {
        return "I can swim short";
    }
}

// One Class implementing ISwimming interface, which is used if the Animal can't swim
class UnableSwimming implements ISwimming {
    // Implement the animal can't swim
    public String swim() {
        return "I can't be swimming";
    }
}
