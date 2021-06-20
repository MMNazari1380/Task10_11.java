package sample;

// ketabkhane ha
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * @author MMNazari1380
 * @version 1.0
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("calculator.fxml"));
            fxmlLoader.setController(new CalculatorController());
            Parent root = fxmlLoader.load();
            //Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
            primaryStage.setTitle("Calculator");
            //chidane size safhe
            primaryStage.setScene(new Scene(root, 450, 460));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
