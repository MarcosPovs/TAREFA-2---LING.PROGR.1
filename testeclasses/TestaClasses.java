import java.util.Scanner;

public class TestaClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando as diferentes classes
        Animais animais = new Animais("Leão", "Carnívoro", "M");
        Cachorros cachorro = new Cachorros("Labrador", "Marrom", "M");
        Carros carro = new Carros("Toyota", "Corolla", "2020");
        Classes classe = new Classes("Clérigo", "Ranged", "12");
        Eletronicos eletronico = new Eletronicos("2021", "Smartphone", "Alta");
        Estados estados = new Estados("Sudeste", "Belo Horizonte", "Minas Gerais");
        Frutas frutas = new Frutas("Morango", "Vermelho", "Frio");
        Moveis moveis = new Moveis("Madeira", "Médio", "Mesa");
        Salgados salgados = new Salgados("Queijo", "Quadrado", "Pastel");
        Talheres talheres = new Talheres("Aço Inox", "Sopas", "Colher");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Exibir Dados e Métodos dos Animais");
            System.out.println("2. Exibir Dados e Métodos dos Cachorros");
            System.out.println("3. Exibir Dados e Métodos dos Carros");
            System.out.println("4. Exibir Dados e Métodos das Classes");
            System.out.println("5. Exibir Dados e Métodos dos Eletrônicos");
            System.out.println("6. Exibir Dados e Métodos dos Estados");
            System.out.println("7. Exibir Dados e Métodos das Frutas");
            System.out.println("8. Exibir Dados e Métodos dos Móveis");
            System.out.println("9. Exibir Dados e Métodos dos Salgados");
            System.out.println("10. Exibir Dados e Métodos dos Talheres");

            System.out.println("11. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Exibir atributos dos Animais
                    System.out.println("\n--- Dados dos Animais ---");
                    System.out.println("Raça: " + animais.getRaca());
                    System.out.println("Alimentação: " + animais.getAlimentacao());
                    System.out.println("Sexo: " + animais.getSexo());

                    // Exibir métodos dos Animais
                    System.out.println("\n--- Métodos dos Animais ---");
                    animais.acordar();
                    animais.fome();
                    animais.filhotes();
                    break;
                case 2:
                    // Exibir atributos dos Cachorros
                    System.out.println("\n--- Dados dos Cachorros ---");
                    System.out.println("Raça: " + cachorro.getRaca());
                    System.out.println("Cor: " + cachorro.getCor());
                    System.out.println("Sexo: " + cachorro.getSexo());

                    // Exibir métodos dos Cachorros
                    System.out.println("\n--- Métodos dos Cachorros ---");
                    cachorro.Humor();
                    cachorro.Idade();
                    cachorro.Dormir();
                    break;
                case 3:
                    // Exibir atributos dos Carros
                    System.out.println("\n--- Dados dos Carros ---");
                    System.out.println("Marca: " + carro.getMarca());
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Ano: " + carro.getAno());

                    // Exibir métodos dos Carros
                    System.out.println("\n--- Métodos dos Carros ---");
                    carro.Cor();
                    carro.Combustivel();
                    carro.Quilometragem();
                    break;
                case 4:
                    // Exibir atributos das Classes
                    System.out.println("\n--- Dados das Classes ---");
                    System.out.println("Classe: " + classe.getNome());
                    System.out.println("Alcance: " + classe.getAlcance());
                    System.out.println("Nível: " + classe.getNivel());

                    // Exibir métodos das Classes
                    System.out.println("\n--- Métodos das Classes ---");
                    classe.dano();
                    classe.vida();
                    classe.dificuldade();
                    break;
                case 5:
                    // Exibir atributos dos Eletrônicos
                    System.out.println("\n--- Dados dos Eletrônicos ---");
                    System.out.println("Ano: " + eletronico.getAnoelet());
                    System.out.println("Função: " + eletronico.getFuncao());
                    System.out.println("Qualidade: " + eletronico.getQualidade());

                    // Exibir métodos dos Eletrônicos
                    System.out.println("\n--- Métodos dos Eletrônicos ---");
                    eletronico.Tipo();
                    eletronico.energia();
                    eletronico.funcionamento();
                    break;
                case 6:
                    // Exibir atributos dos Estados
                    System.out.println("\n--- Dados dos Estados ---");
                    System.out.println("Região: " + estados.getRegiao());
                    System.out.println("Capital: " + estados.getCapital());
                    System.out.println("Nome: " + estados.getNome());

                    // Exibir métodos dos Estados
                    System.out.println("\n--- Métodos dos Estados ---");
                    estados.Culinaria();
                    estados.sotaque();
                    estados.PIB();
                    break;
                case 7:
                    // Exibir atributos das Frutas
                    System.out.println("\n--- Dados das Frutas ---");
                    System.out.println("Sabor: " + frutas.getSabor());
                    System.out.println("Cor: " + frutas.getCor());
                    System.out.println("Clima: " + frutas.getClima());

                    // Exibir métodos das Frutas
                    System.out.println("\n--- Métodos das Frutas ---");
                    frutas.tamanho();
                    frutas.semente();
                    frutas.textura();
                    break;
                case 8:
                    // Exibir atributos dos Móveis
                    System.out.println("\n--- Dados dos Móveis ---");
                    System.out.println("Material: " + moveis.getMaterial());
                    System.out.println("Tamanho: " + moveis.getTamanho());
                    System.out.println("Nome: " + moveis.getNome());

                    // Exibir métodos dos Móveis
                    System.out.println("\n--- Métodos dos Móveis ---");
                    moveis.local();
                    moveis.resistencia();
                    moveis.capacidade();
                    break;
                case 9:
                    // Exibir atributos dos Salgados
                    System.out.println("\n--- Dados dos Salgados ---");
                    System.out.println("Sabor: " + salgados.getSabor());
                    System.out.println("Formato: " + salgados.getFormato());
                    System.out.println("Nome: " + salgados.getNome());

                    // Exibir métodos dos Salgados
                    System.out.println("\n--- Métodos dos Salgados ---");
                    salgados.massa();
                    salgados.recheio();
                    salgados.temp();
                    break;
                case 10:
                    // Exibir atributos dos Talheres
                    System.out.println("\n--- Dados dos Talheres ---");
                    System.out.println("Material: " + talheres.getMaterial());
                    System.out.println("Utilidade: " + talheres.getUtilidade());
                    System.out.println("Nome: " + talheres.getNome());

                    // Exibir métodos dos Talheres
                    System.out.println("\n--- Métodos dos Talheres ---");
                    talheres.ponta();
                    talheres.tamanho();
                    talheres.Formato();
                    break;
                case 11:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
