module com.montree.quizapp_2451052268 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.montree.quizapp_2451052268 to javafx.fxml;
    exports com.montree.quizapp_2451052268;
}
