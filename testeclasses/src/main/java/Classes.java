public class Classes {

    // Atributos
    private String nome;
    private String alcance;
    private String nivel;

    // Construtor
    public Classes(String nome, String alcance, String nivel ) {
        this.nome = nome;
        this.alcance = alcance;
        this.nivel = nivel;
    }

    // Métodos
    public void dano() {System.out.println("O dano da classe é Baixo");
    }

    public void vida() {
        System.out.println("A classe tem pouca vida");
    }

    public void dificuldade() {System.out.println("A classe é de alta dificuldade");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
