import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15 extends Application
{

    private PathTransition pathTransitionEllipse;
    private PathTransition pathTransitionCircle;

    private void init(Stage primaryStage)
    {
        
        Pane pane = new Pane();
        double width = 400;
        double height = 400;
        Scene scene = new Scene(pane, width, height);
        
        
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 600, 600));

        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);

        // Ellipse path example
        Rectangle rect = new Rectangle(0, 0, 40, 40);
        rect.setArcHeight(10);
        rect.setArcWidth(10);
        rect.setFill(Color.ORANGE);
        pane.getChildren().add(rect);
        ObservableList<Double> list = polygon.getPoints();

        final double WIDTH = 200, HEIGHT = 200;
                double centerX = WIDTH / 2, centerY = HEIGHT / 2;
                double radius = Math.min(WIDTH, HEIGHT) * 0.4;
        

        // Add points to polygon list
                for (int i = 0; i < 5; i++) {
                    list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
                    list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));

        pathTransitionEllipse = new PathTransition();
        pathTransitionEllipse.setDuration(Duration.seconds(4));
        pathTransitionEllipse.setPath(polygon);
        pathTransitionEllipse.setNode(rect);
        pathTransitionEllipse.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransitionEllipse.setCycleCount(Timeline.INDEFINITE);
        pathTransitionEllipse.setAutoReverse(false);
        polygon.setFill(Color.BLACK);
        pathTransitionEllipse.play();


        FadeTransition fadeTrans = new FadeTransition(Duration.millis(5000), rect);
        fadeTrans.setFromValue(1.0);
        fadeTrans.setToValue(0);
        fadeTrans.setAutoReverse(true);
        fadeTrans.setCycleCount(Timeline.INDEFINITE);
        fadeTrans.play();
        
        pane.setOnMousePressed(e-> {
            pathTransitionEllipse.pause();
            fadeTrans.pause();
});
        pane.setOnMouseReleased(e-> {
            pathTransitionEllipse.play();
            fadeTrans.play();
});
        //pane.getChildren().addAll(rect);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving text");
        primaryStage.show();
    
    
        
        // Cirle path example
    }
    }
    private Path createEllipsePath(double centerX, double centerY, double radiusX, double radiusY, double rotate)
    {
        ArcTo arcTo = new ArcTo();
        arcTo.setX(centerX - radiusX + 1); // to simulate a full 360 degree celcius circle.
        arcTo.setY(centerY - radiusY);
        arcTo.setSweepFlag(false);
        arcTo.setLargeArcFlag(true);
        arcTo.setRadiusX(radiusX);
        arcTo.setRadiusY(radiusY);
        arcTo.setXAxisRotation(rotate);

        Path path = new Path();
        path.getElements().addAll(
                new MoveTo(centerX - radiusX, centerY - radiusY),
                arcTo,
                new ClosePath()); // close 1 px gap.
        path.setStroke(Color.DODGERBLUE);
        path.getStrokeDashArray().setAll(5d, 5d);
        return path;
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        init(primaryStage);
        primaryStage.show();
        pathTransitionEllipse.play();
        
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}