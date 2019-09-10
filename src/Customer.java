public class Customer extends Human {
    Size size;

    public Customer(String _name, Male _male, Size _size) {
        super(_name, _male);
        this.size = _size;
    }
}
