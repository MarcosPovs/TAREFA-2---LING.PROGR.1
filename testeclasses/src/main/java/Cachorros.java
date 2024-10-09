public class Cachorros {

    // Atributos
    private String raca;
    private String Cor;
    private String sexo;

    // Construtor
    public Cachorros(String raca, String cor, String sexo) {
        this.raca = raca;
        this.Cor = cor;
        this.sexo = sexo;
    }

    // Métodos
    public void Humor() {
        System.out.println("O Cachorro está Feliz");
    }

    public void Idade() {
        System.out.println("O Cachorro é Jovem.");
    }
    public void Dormir() {
        System.out.println("O O cachorro está com sono.");
    }

    // Getters e Setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
