package hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloFX extends Application {

    private static Logger logger = LogManager.getLogger(HelloFX.class);

    public static void main(String[] args) {
        HelloFX.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        logger.info("HelloFX Application starting");
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label label = new Label(
                "Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        ImageView imageView = new ImageView(
                new Image(HelloFX.class.getResourceAsStream("/images/openduke.png")));
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(30, imageView, label);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        logger.info("HelloFX Application started");
    }

    @Override
    public void stop() throws Exception {
        logger.info("HelloFX Application stopping");
        System.exit(0);
    }

}
