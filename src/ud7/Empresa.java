package ud7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Empresa extends Application {
    private int id;
    private String nombre;
    private String url;

    static List<Empresa> empresas = new ArrayList<>();

    public Empresa(int id, String nombre, String url) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
    }

    public static void main(String[] args) {
        empresas.add(new Empresa(1, "Ies Chan Do Monte", "http://ieschandomonte.edu.es"));
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Empresa");
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(Empresa.class.getResource("Empresa.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
