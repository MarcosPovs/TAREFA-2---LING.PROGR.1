public class Frutas {

    // Atributos
    private String sabor;
    private String cor;
    private String clima;

    // Construtor
    public Frutas(String sabor, String cor, String clima) {
        this.sabor = sabor;
        this.cor = cor;
        this.clima = clima;
    }

    // Métodos
    public void tamanho() {
        System.out.println("A fruta é pequena");
    }

    public void semente() {
        System.out.println("A fruta possui muitas sementes");
    }

    public void textura() {
        System.out.println("A fruta é macia");
    }

    // Getters e Setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
