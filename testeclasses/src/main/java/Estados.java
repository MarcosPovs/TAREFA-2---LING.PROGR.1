public class Estados {

    // Atributos
    private String regiao;
    private String capital;
    private String nome;

    // Construtor
    public Estados(String regiao, String capital, String nome) {
        this.regiao = regiao;
        this.capital = capital;
        this.nome = nome;
    }

    // Métodos
    public void Culinaria() {
        System.out.println("O Estado tem como principal prato o pão de queijo");
    }

    public void sotaque() {
        System.out.println("O Estado possui sotaque mineiro.");
    }

    public void PIB() {
        System.out.println("O Estado possui um PIB Alto.");
    }

    // Getters e Setters
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
