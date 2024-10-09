package org.example.CadastroCarro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carrega o arquivo FXML
            Parent root = FXMLLoader.load(getClass().getResource("../../../../../../../../../../../Git Projects/JavaFx/test/Nova pasta/TAREFA3/src/main/resources/org/example/tarefa3/carro_app.fxml"));

            // Define o título da janela
            primaryStage.setTitle("Cadastro de Carros");

            // Cria a cena com o layout definido no arquivo FXML
            Scene scene = new Scene(root);

            // Define a cena no Stage (janela) e exibe
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}
