public class Eletronicos {


    // Atributos
    private String anoelet;
    private String funcao;
    private String qualidade;

    // Construtor
    public Eletronicos(String anoelet, String funcao, String qualidade) {
        this.anoelet = anoelet;
        this.funcao = funcao;
        this.qualidade = qualidade;
    }

    // Métodos
    public void Tipo() {System.out.println("O eletronico é audiovisual");
    }

    public void energia() {System.out.println("O eletronico funciona a baterias");
    }

    public void funcionamento() {System.out.println("O eletronico funciona por toques na tela");
    }

    // Getters e Setters
    public String getAnoelet() {
        return anoelet;
    }

    public void setAnoelet(String anoelet) {
        this.anoelet = anoelet;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
}

