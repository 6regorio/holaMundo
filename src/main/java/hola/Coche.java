package hola;

public class Coche {
  String color;
  String marca;  
  
  public Coche(String color, String marca) {
    super();
    this.color = color;
    this.marca = marca;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  @Override
  public String toString() {
    return "Coche [color=" + color + ", marca=" + marca + "]";
  }
    
}
