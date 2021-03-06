import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class sudokuSolver extends Application {
    
    
    @Override
   public void start(Stage primaryStage) throws Exception{
    	
    	final FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/grid.fxml"));
    	final Pane p = loader.load();
    	Scene scene = new Scene(p);
    	
    	primaryStage.setScene(scene);
    	primaryStage.setTitle("Sudoku Solver");
    	
    	
    	
    	
    	primaryStage.show();
    	
    	
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
