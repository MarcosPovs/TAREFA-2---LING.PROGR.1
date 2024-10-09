import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Carros extends Application {

    // Lista para armazenar os carros cadastrados
    private ObservableList<Carros> carros = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }

    @Override
    public void start(Stage primaryStage) {
        // Campos de texto para os atributos do carro
        TextField marcaField = new TextField();
        TextField modeloField = new TextField();
        TextField anoField = new TextField();

        // Botão para salvar o carro
        Button salvarButton = new Button("Salvar Carro");

        // Tabela para exibir os carros cadastrados
        TableView<Carros> table = new TableView<>(carros);

        // Colunas da tabela
        TableColumn<Carros, String> marcaColumn = new TableColumn<>("Marca");
        marcaColumn.setCellValueFactory(data -> data.getValue().marcaProperty());

        TableColumn<Carros, String> modeloColumn = new TableColumn<>("Modelo");
        modeloColumn.setCellValueFactory(data -> data.getValue().modeloProperty());

        TableColumn<Carros, String> anoColumn = new TableColumn<>("Ano");
        anoColumn.setCellValueFactory(data -> data.getValue().anoProperty());

        // Adiciona as colunas à tabela
        table.getColumns().addAll(marcaColumn, modeloColumn, anoColumn);

        // Ação do botão "Salvar Carro"
        salvarButton.setOnAction(e -> {
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            String ano = anoField.getText();

            // Cria um novo carro e adiciona à lista
            Carros novoCarro = new Carros(marca, modelo, ano);
            carros.add(novoCarro);

            // Limpa os campos de texto
            marcaField.clear();
            modeloField.clear();
            anoField.clear();
        });

        // Layout da aplicação (usando VBox para organizar os elementos)
        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Marca:"), marcaField,
                new Label("Modelo:"), modeloField,
                new Label("Ano:"), anoField,
                salvarButton,
                new Label("Carros Cadastrados:"),
                table);

        // Cena e palco da aplicação
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("Cadastro de Carros");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
