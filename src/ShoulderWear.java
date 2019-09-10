public class ShoulderWear extends CasualWear {
    String sleeve;

    public ShoulderWear(String _name, String _code, double _price, String _article, String _color,
                         Size _size, String _season, String _style, ClothesType _type, String _sleeve
                        ) {
        super();
        this.name = _name;
        this.code = _code;
        this.price = _price;
        this.article_number = _article;
        this.color = _color;
        this.size = _size;
        this.season = _season;
        this.style = _style;
        this.type = _type;
        this.sleeve = _sleeve;
    }
}
