public class ShoulderWear extends CasualWear {
    String sleeve;

    public ShoulderWear(String _name, double _price, String _code, String _article,
                        String _color, ClothesType _type, String _style, String _season, Size _size, String _composition,
                        String _sleeve) {
        super(_name, _price, _code, _article, _color, _type, _style, _season, _size, _composition);
        this.sleeve = _sleeve;
    }
}
