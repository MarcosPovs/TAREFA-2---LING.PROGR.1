public class Talheres {

    // Atributos
    private String material;
    private String utilidade;
    private String nome;

    // Construtor
    public Talheres(String material, String utilidade, String nome) {
        this.material = material;
        this.utilidade = utilidade;
        this.nome = nome;
    }

    // Métodos
    public void ponta() {
        System.out.println("O talher não possui pontas");
    }

    public void tamanho() {
        System.out.println("O talher é pequeno");
    }

    public void Formato() {
        System.out.println("O talher é redondo");
    }

    // Getters e Setters
    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
