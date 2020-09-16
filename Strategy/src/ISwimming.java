// The interface is implemented by many other subclasses that allow for many types of Swimming
// without effecting Animal.
// Classes that implement new Swimming interface, subclasses can allow other classes to use
// that code eliminating code duplication

//
public interface ISwimming {
    //
    public String swim();
}

//
class LongSwimming implements ISwimming {
    //
    public String swim() {
        return "I can swim long";
    }
}

//
class ShortSwimming implements ISwimming {
    //
    public String swim() {
        return "I can swim short";
    }
}

//
class UnableSwimming implements ISwimming {
    //
    public String swim() {
        return "I can't be swimming";
    }
}
