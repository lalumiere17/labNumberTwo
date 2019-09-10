enum ClothesType {
    MEN, WOMEN, KIDS
}

public abstract class Clothes extends Product {
    String color;
    ClothesType type;
    String style;
    String season;
    Size size;
}
