public class Salgados {

    // Atributos
    private String sabor;
    private String formato;
    private String nome;

    // Construtor
    public Salgados(String sabor, String formato, String nome) {
        this.sabor = sabor;
        this.formato = formato;
        this.nome = nome;
    }

    // Métodos
    public void massa() {
        System.out.println("O salgado é feito de massa frita");
    }

    public void recheio() {
        System.out.println("O salgado possui recheio de queijo");
    }

    public void temp() {
        System.out.println("O salgado está quente");
    }

    // Getters e Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
