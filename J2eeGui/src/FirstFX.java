
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FirstFX extends Application {

	Label lbl;
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		lbl=new Label("enouveau textee");
		
		VBox root=new VBox();
		root.getChildren().add(lbl);
		
		Scene scene=new Scene(root);
		stage.setScene(scene);
		
		stage.show();	
	}

}
