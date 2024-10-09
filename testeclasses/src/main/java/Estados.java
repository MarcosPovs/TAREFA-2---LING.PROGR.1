public class Estados {

    // Atributos
    private String regiao;
    private String capital;
    private String litoral;

    // Construtor
    public Estados(String regiao, String capital, String litoral) {
        this.regiao = regiao;
        this.capital = capital;
        this.litoral = litoral;
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

    public String getLitoral() {
        return litoral;
    }

    public void setLitoral(String litoral) {
        this.litoral = litoral;
    }
}
