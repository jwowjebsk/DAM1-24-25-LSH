package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {
    private TextField txtNum1 = new TextField("Escribe el precio en euros");
    private TextField txtNum2 = new TextField("O escribe el precio en dólares");
    private Button btnConvertir = new Button("Convertir");
    private Label lblResultadoEur = new Label("Aquí saldrá el precio en euros");
    private Label lblResultadoDol = new Label("Aquí saldrá el precio en dólares");
    
    @Override
    public void start(Stage primaryStage) {
        this.txtNum1.setOnKeyTyped(e -> this.convertir(true));
        this.txtNum2.setOnKeyTyped(e -> this.convertir(false));
        this.btnConvertir.setOnAction(e -> this.convertir(true));

        VBox vbox = new VBox(this.txtNum1, this.txtNum2, this.btnConvertir, this.lblResultadoEur, this.lblResultadoDol);
        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void convertir(boolean isEur) {
        double resultado;
        try {
            if (isEur) {
                resultado = Double.parseDouble(this.txtNum1.getText());
                this.lblResultadoDol.setText("Precio en dólares: " + resultado);
            } else {
                resultado = Double.parseDouble(this.txtNum2.getText());
                this.lblResultadoEur.setText("Precio en euros: " + resultado);
            }
        } catch (NumberFormatException e) {
            this.lblResultadoEur.setText("ERROR: El número que has introducido no es un double");
        } catch (RuntimeException ex) {
            this.lblResultadoEur.setText("ERROR: Algún operando no es un número");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
