public class WaistbandWear extends CasualWear {
    String shape;
    String length;

    public WaistbandWear(String _name, double _price, String _code, String _article,
                         String _color, ClothesType _type, String _style, String _season, Size _size, String _composition,
                         String _shape, String _length) {
        super(_name, _price, _code, _article, _color, _type, _style, _season, _size, _composition);
        this.shape = _shape;
        this.length = _length;
    }
}
