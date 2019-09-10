enum ClothesType {
    MEN, WOMEN, KIDS
}

public abstract class Clothes extends Product {
    String color;
    ClothesType type;
    String style;
    String season;
    Size size;

    public Clothes(String _name, double _price, String _code, String _article,
                   String _color, ClothesType _type, String _style, String _season, Size _size) {
        super(_name, _price, _code, _article);
        this.color = _color;
        this.type = _type;
        this.style = _style;
        this.season = _season;
        this.size = _size;
    }
}
