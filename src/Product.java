public abstract class Product {
    String name;
    double price;
    String code;
    String article_number;

    public Product(String _name, double _price, String _code, String _article) {
      this.name = _name;
      this.price = _price;
      this.code = _code;
      this.article_number = _article;
    };



    void Buy(){

    };
    void Look(){};
    void LikeOrDislike(){};
}
