package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {
    public void zone() throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../Views/zone.fxml"));
        Scene scene=new Scene(root,1152,610);
        primaryStage.setTitle("لوحة التحكم المستخدمين  ");
        primaryStage.setScene( scene );
        primaryStage.show();

    }

}
