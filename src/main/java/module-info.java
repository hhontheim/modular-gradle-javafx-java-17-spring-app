module app {
    requires library;

    requires javafx.graphics;

    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;


    opens com.example.demo.application to javafx.graphics;
}
