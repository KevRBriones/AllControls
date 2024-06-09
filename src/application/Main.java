package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("All Controls Demo");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));

        // Configurar las medidas de las columnas
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(30); // 30% del ancho total
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(70); // 70% del ancho total
        grid.getColumnConstraints().addAll(column1, column2);

        // Primera columna: nombres de los controles
        int row = 0;
        grid.add(new Label("Button:"), 0, row++);
        grid.add(new Label("CheckBox:"), 0, row++);
        grid.add(new Label("Hyperlink:"), 0, row++);
        grid.add(new Label("ToggleButton:"), 0, row++);
        grid.add(new Label("RadioButton:"), 0, row++);
        grid.add(new Label("Label:"), 0, row++);
        grid.add(new Label("TextField:"), 0, row++);
        grid.add(new Label("PasswordField:"), 0, row++);
        grid.add(new Label("TextArea:"), 0, row++);
        grid.add(new Label("ProgressIndicator:"), 0, row++);
        grid.add(new Label("ProgressBar:"), 0, row++);
        grid.add(new Label("Slider:"), 0, row++);

        // Segunda columna: controles
        row = 0;
        grid.add(new Button("Click Me"), 1, row++);
        grid.add(new CheckBox("Check Me"), 1, row++);
        grid.add(new Hyperlink("JavaFX Link"), 1, row++);
        grid.add(new ToggleButton("Toggle Me"), 1, row++);

        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Option 1");
        rb1.setToggleGroup(group);
        grid.add(rb1, 1, row++);

        grid.add(new Label("Sample Label"), 1, row++);
        grid.add(new TextField("Edit Me"), 1, row++);
        grid.add(new PasswordField(), 1, row++);

        TextArea textArea = new TextArea("Multi-line\nText Area");
        textArea.setPrefRowCount(3);
        grid.add(textArea, 1, row++);

        ProgressIndicator pi = new ProgressIndicator();
        pi.setProgress(0.75);
        grid.add(pi, 1, row++);

        ProgressBar pb = new ProgressBar();
        pb.setProgress(0.5);
        grid.add(pb, 1, row++);

        Slider slider = new Slider(0, 100, 50);
        grid.add(slider, 1, row);

        Scene scene = new Scene(grid, 400, 500);
        primaryStage.setScene(scene);

        // Hacer la ventana no redimensionable
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}