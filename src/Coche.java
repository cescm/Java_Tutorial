public class Coche {
    private String color;
    private String marca;
    private Integer potencia;

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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getInfo(){
       return "El coche de la marca " + marca + " es de color " + color + " y tiene " + potencia + " caballos.";
    }
}
