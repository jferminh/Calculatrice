module io.github.jferminh.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.jferminh.calculatrice to javafx.fxml;
    exports io.github.jferminh.calculatrice;
}