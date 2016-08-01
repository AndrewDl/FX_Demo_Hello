import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Andrew on 07/29/16.
 */
public class FX_Demo_Hello extends Application{
    Label label = new Label();
    Button button = new Button();
    Button button2 = new Button();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox layout = new VBox();
        Scene scene = new Scene(layout,600,400);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);

        button.setText("Ha-ha");
        button.setOnMouseMoved(e -> label.setText("Oooo i really love it when u touch me there...")); /*{
            @Override
            public void handle(MouseEvent event) {
                label.setText("Oooo i really love it when u touch me there...");
            }
        });*/

        layout.getChildren().add(button);
        layout.getChildren().add(label);

        label.setText("Hi-hi");

        button2.setText("OK");
        button2.setOnAction(e -> label.setText("OK Ehe-hey!"));
        layout.getChildren().add(button2);
       // layout.getChildren().add(label);

        primaryStage.show();

    }

}
