module com.github.harjoitustyogithub.harjoitustyo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.harjoitustyogithub.harjoitustyo to javafx.fxml;
    exports com.github.harjoitustyogithub.harjoitustyo;
}