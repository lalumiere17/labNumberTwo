enum AccessoriesType {
    MEN, WOMEN, KIDS
}
public class Accessories extends Product {
    AccessoriesType type;

    public Accessories(String _name, double _price, String _code, String _article,
                   AccessoriesType _type) {
        super(_name, _price, _code, _article);
        this.type = _type;
    }
}
