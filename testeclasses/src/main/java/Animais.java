public class Animais {

    // Atributos
    private String raca;
    private String alimentacao;
    private String sexo;

    // Construtor
    public Animais(String raca, String alimentacao, String sexo) {
        this.raca = raca;
        this.alimentacao = alimentacao;
        this.sexo = sexo;
    }

    // Métodos
    public void acordar() {
        System.out.println("O animal está acordado");
    }

    public void fome() {
        System.out.println("O animal está com fome.");
    }

    public void filhotes() {
        System.out.println("O animal não tem filhotes.");
    }

    // Getters e Setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
