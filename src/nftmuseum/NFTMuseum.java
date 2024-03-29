package nftmuseum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NFTMuseum extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("NFT Museum Design Patterns");
        primaryStage.setScene(new Scene(root, 920, 600));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
