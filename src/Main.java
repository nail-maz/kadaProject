import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Views/Home.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene=new Scene(root,1108,698);
        primaryStage.setTitle("لوحة التحكم  ");
        primaryStage.setScene( scene );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

