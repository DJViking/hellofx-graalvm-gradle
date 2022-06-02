module hellofx {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;

    requires org.apache.logging.log4j;

    exports hellofx to javafx.graphics, javafx.fxml;

    opens hellofx to javafx.graphics, javafx.fxml;
}
