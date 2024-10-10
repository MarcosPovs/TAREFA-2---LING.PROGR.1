public class Carros {

    // Atributos
    private String marca;
    private String modelo;
    private String ano;

    // Construtor
    public Carros(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void Cor() {
        System.out.println("O Carro é azul");
    }
    public void Combustivel() {
        System.out.println("O tanque do carro está cheio");
    }
    public void Quilometragem() {
        System.out.println("O Carro tem muita quilometragem");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
