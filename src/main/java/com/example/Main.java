import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MuscularDiagramApp extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Muscle biceps = new Muscle("Biceps", 100, 200, 50, 100, "Flexes the arm", "Scapula", "Radius");
        Muscle triceps = new Muscle("Triceps", 200, 200, 50, 100, "Extends the arm", "Humerus", "Ulna");

        MuscleGroup arm = new MuscleGroup("Arm");
        arm.addMuscle(biceps);
        arm.addMuscle(triceps);

        // Draw muscles
        arm.drawGroup();

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Interactive Muscular Diagram");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
