public class Outewear extends Clothes {
    String length;
    Fabric fabric;
    String filler;

    public Outewear(String _name, double _price, String _code, String _article,
                    String _color, ClothesType _type, String _style, String _season, Size _size,
                    String _length, Fabric _fabric, String _filler) {
        super(_name, _price, _code, _article, _color, _type, _style, _season, _size);
        this.length = _length;
        this.fabric = _fabric;
        this.filler = _filler;
    }
}
