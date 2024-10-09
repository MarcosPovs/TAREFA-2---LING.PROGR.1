public class Classes {

    // Atributos
    private String dano;
    private String alcance;
    private String nivel;

    // Construtor
    public Classes(String dano, String alcance, String nivel ) {
        this.dano = dano;
        this.alcance = alcance;
        this.nivel = nivel;
    }

    // Métodos
    public void tipo() {System.out.println("A classe é suporte");
    }

    public void vida() {
        System.out.println("A classe tem pouca vida");
    }

    public void dificuldade() {System.out.println("A classe é de alta dificuldade");
    }

    // Getters e Setters
    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
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
