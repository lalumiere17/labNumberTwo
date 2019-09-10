public class Outewear extends Clothes {
    String length;
    Fabric fabric;
    String filler;

    public Outewear(String _name, String _code, double _price, String _article, String _color,
                    Size _size, String _season, String _style, ClothesType _type, String _length,
                    Fabric _fabric, String _filler) {
        this.name = _name;
        this.code = _code;
        this.price = _price;
        this.article_number = _article;
        this.color = _color;
        this.size = _size;
        this.season = _season;
        this.style = _style;
        this.type = _type;
        this.length = _length;
        this.fabric = _fabric;
        this.filler = _filler;
    }
}
