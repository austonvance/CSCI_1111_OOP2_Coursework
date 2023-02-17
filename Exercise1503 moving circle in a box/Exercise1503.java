import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Exercise1503 extends Application {
	private BallPane ballPane = new BallPane();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold four buttons in a HBox
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);

		// Create and register the handler
		btLeft.setOnAction(e -> ballPane.left());
		btRight.setOnAction(e -> ballPane.right());
		btUp.setOnAction(e -> ballPane.up());
		btDown.setOnAction(e -> ballPane.down());

		// Create a border pane
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(0, 10, 5, 10));
		pane.setCenter(ballPane);
		pane.setBottom(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise1503"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}

class BallPane extends Pane {
	private Circle circle = new Circle(20, 20, 20);
	
	// Construct a default ball pane
	public BallPane() {
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle); // Place a ball into this pane
	}
	
	// Move ball left
	public void left() { 
		circle.setCenterX(circle.getCenterX() > circle.getRadius() ? 
			circle.getCenterX() - 20 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}
	
	// Move ball right
	public void right() {
		circle.setCenterX(circle.getCenterX() < getWidth() - circle.getRadius() ? 
			circle.getCenterX() + 20 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}
	
	// Move ball up
	public void up() {
		circle.setCenterY(circle.getCenterY() > circle.getRadius() ? 
			circle.getCenterY() - 20 : circle.getCenterY());
		circle.setCenterX(circle.getCenterX());
	}
	
	// Move ball down
	public void down() {
		circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY() < getHeight() - circle.getRadius() ? 
			circle.getCenterY() + 20 : circle.getCenterY());
	}
}