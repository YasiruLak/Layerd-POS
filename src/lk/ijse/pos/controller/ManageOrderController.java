package lk.ijse.pos.controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

public class ManageOrderController {
    public Label lblDate;
    public AnchorPane root;

    public void initialize(){
        lblDate.setText(LocalDate.now().toString());
    }

    public void navigateToBack(MouseEvent event) throws IOException {
        URL resource = this.getClass().getResource("/lk/ijse/pos/view/CashierMain.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.root.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.setTitle("SUPERMARKET POS SYSTEM   |   YASIRU DAHANAYAKA");
        primaryStage.centerOnScreen();
        Platform.runLater(() -> primaryStage.sizeToScene());
    }
}
