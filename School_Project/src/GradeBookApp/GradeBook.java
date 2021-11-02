package GradeBookApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GradeBook extends Application {

	// labels.combobox and textfields

	private Label firstName = new Label("First Name");
	private Label lastName = new Label("Last Name");
	private Label course = new Label("Course");
	private Label grade = new Label("Grade");

	private Button btnClear = new Button("Clear");
	private Button btnSave = new Button("Save");
	private Button btnView = new Button("View");
	private ComboBox<String> listBox = new ComboBox<>();

	private TextField fName = new TextField();
	private TextField lName = new TextField();
	private TextField cName = new TextField();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// create boarder pane for holding top and bottom panes

		BorderPane bPane = new BorderPane();
		bPane.setTop(TopPane());
		bPane.setBottom(bottomPane());

		// Action Event

		btnView.setOnAction(new ViewList());// inner class created to view list
		btnClear.setOnAction(new clearEntry());// inner class created to clear the form
		btnSave.setOnAction(new saveList());// new inner class to save the entry in the csv file

		//create scene and set stage
		Scene scene = new Scene(bPane, 250, 200);

		primaryStage.setTitle("GradeBookApp");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private Node TopPane() {
		// create Grid pane and to set properties
		GridPane pane = new GridPane();

		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(12, 12, 12, 12));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Drop down using combo box
		listBox.getItems().addAll("A", "B", "C", "D", "E", "F");

		pane.add(firstName, 0, 0);
		pane.add(fName, 1, 0);
		pane.add(lastName, 0, 1);
		pane.add(lName, 1, 1);
		pane.add(course, 0, 2);
		pane.add(cName, 1, 2);
		pane.add(grade, 0, 3);
		pane.add(listBox, 1, 3);
		return pane;
	}

	private Node bottomPane() {
		// create HBox for the button

		HBox hBox = new HBox();
		hBox.setPadding(new Insets(12, 12, 12, 12));
		hBox.setSpacing(12);
		hBox.setAlignment(Pos.BASELINE_RIGHT);
		hBox.getChildren().addAll(btnClear, btnSave, btnView);
		return hBox;
	}

//inner class to list the entry
	class ViewList implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			Stage stage2 = new Stage();
			Pane pane = new Pane();
			Scene scene2 = new Scene(pane, 400, 450);
			stage2.setTitle("Grades_Display");
			stage2.setScene(scene2);
			stage2.show();

		}

	}

	// inner class to clear all the entry on the gui

	class clearEntry implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {

			fName.clear();
			lName.clear();
			cName.clear();
			listBox.getSelectionModel().clearSelection();
		}

	}

	class saveList implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

}
