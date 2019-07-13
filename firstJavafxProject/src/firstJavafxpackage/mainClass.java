package firstJavafxpackage;

import javafx.application.*;
/*import javafx.event.ActionEvent;
import javafx.event.EventHandler;*/
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
/*import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;*/
import javafx.stage.Stage;

public class mainClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		/*Button btn = new Button("Click me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> System.exit(0));
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Hello Anjali");
			}
		});
		VBox root = new VBox();
		root.getChildren().addAll(btn,exit);*/
		
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		arg0.setTitle("My Application");
		arg0.setScene(scene);
		arg0.show();
	}

}
