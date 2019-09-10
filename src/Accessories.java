enum AccessoriesType {
    MEN, WOMEN, KIDS
}
public class Accessories extends Product {
    AccessoriesType type;

    public Accessories(String _name, String _code, double _price, String _article, AccessoriesType _type) {
        this.name = _name;
        this.code = _code;
        this.price = _price;
        this.article_number = _article;
        this.type = _type;
    }
}
