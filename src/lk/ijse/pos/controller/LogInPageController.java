package lk.ijse.pos.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LogInPageController{
    public AnchorPane mainLayer;
    public JFXTextField txtUserName;
    public JFXPasswordField pswPassword;
    public JFXButton btnLogIn;

    public void logInOnAction(ActionEvent actionEvent) throws IOException {

        if (txtUserName.getText().equals("A")){

            Stage logStage = (Stage) btnLogIn.getScene().getWindow();
            logStage.close();

            URL resource = this.getClass().getResource("/lk/ijse/pos/view/AdminMain.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setTitle("ADMIN MAIN VIEW   |   YASIRU DAHANAYAKA");
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setScene(scene);
            stage.show();
        }else if (txtUserName.getText().equals("C")){

            Stage logStage = (Stage) btnLogIn.getScene().getWindow();
            logStage.close();

            URL resource = this.getClass().getResource("/lk/ijse/pos/view/CashierMain.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setTitle("CASHIER MAIN VIEW   |   YASIRU DAHANAYAKA");
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setScene(scene);
            stage.show();
        }
    }
}
