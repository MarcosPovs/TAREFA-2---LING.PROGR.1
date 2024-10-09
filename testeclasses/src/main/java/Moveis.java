public class Moveis {

    // Atributos
    private String material;
    private String tamanho;
    private String nome;

    // Construtor
    public Moveis(String material, String tamanho, String nome) {
        this.material = material;
        this.tamanho = tamanho;
        this.nome = nome;
    }

    // Métodos
    public void local() {
        System.out.println("O móvel está na sala");
    }

    public void resistencia() {
        System.out.println("O móvel é frágil");
    }

    public void capacidade() {
        System.out.println("Cabem muitas coisas no móvel");
    }

    // Getters e Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
