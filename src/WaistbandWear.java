public class WaistbandWear extends CasualWear {
    String shape;
    String length;

    public WaistbandWear(String _name, String _code, double _price, String _article, String _color,
                    Size _size, String _season, String _style, ClothesType _type, String _length,
                    String _shape) {
        this.name = _name;
        this.code = _code;
        this.price = _price;
        this.article_number = _article;
        this.color = _color;
        this.size = _size;
        this.season = _season;
        this.style = _style;
        this.type = _type;
        this.shape = _shape;
        this.length = _length;
    }
}
