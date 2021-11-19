package GradeBookApp;

import java.util.List;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Deepa This class is the GUI part has fields and start() methods Start
 *         method holds the action even for clear, save and view*
 * 
 *
 */
public class GradeBook extends Application {

	// labels.combobox and text fields

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

		// create boarder pane for holding labels, fields and buttons

		BorderPane bPane = new BorderPane();

		bPane.setCenter(centerPane());
		Scene scene = new Scene(bPane, 350, 250);

		primaryStage.setTitle("GradeBookApp");
		primaryStage.setScene(scene);
		primaryStage.show();

		// Action Event lambda expression to clear the form

		btnClear.setOnAction(e -> {
			fName.clear();
			lName.clear();
			cName.clear();
			listBox.getSelectionModel().clearSelection();

		});

		// Action Event lambda expression to save the entry

		btnSave.setOnAction(e -> {
			Student student = null;

			{
				String firstName = fName.getText();
				String lastName = lName.getText();
				String courseName = cName.getText();
				String grade = listBox.getValue();
				if (StudentIO.getString(firstName, lastName, courseName, grade))// validation point for the input values
					student = new Student(firstName, lastName, courseName, grade);// if validation passes-student object
																					// is created.

				try {

					StudentIO.insert(student);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
					// e1.printStackTrace();
				}

			}
		});
		//// Action Event Lambda expression to view

		btnView.setOnAction(e -> {

			GridPane view = new GridPane();

			try {
				List<Student> student = StudentIO.findAll();
				int i = 2;
				for (Student s : student) {

					Text text = new Text(s.toString());

					view.addRow(i++, text);

				}
				Button btnBack = new Button("                   Click Back to the Main Page                 ");
				view.addRow(0, btnBack);
				ScrollPane sc = new ScrollPane(view);// scrolls the list of entry
				bPane.setCenter(sc); // flips the view

				btnBack.setOnAction(x -> {
					bPane.setCenter(centerPane());// back to the main page button action

				});

			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		});

	}

	/**
	 * @return pane GUI part to hold the labels and the fields
	 */
	private Node centerPane() {
		// create Grid pane and to set properties
		GridPane pane = new GridPane();
		pane.setBackground(new Background(new BackgroundFill(Color.LIGHTSTEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(12, 12, 12, 12));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Drop down using combo box
		listBox.getItems().addAll("A", "B", "C", "D", "E", "F");

		pane.add(firstName, 0, 2);
		pane.add(fName, 1, 2);
		pane.add(lastName, 0, 4);
		pane.add(lName, 1, 4);
		pane.add(course, 0, 6);
		pane.add(cName, 1, 6);
		pane.add(grade, 0, 8);
		pane.add(listBox, 1, 8);
		pane.add(buttonPane(), 1, 15);

		return pane;
	}

	/**
	 * @return pane Gui part to hold the buttons at the bottom horizontally
	 */
	private Node buttonPane() {
		// create hBox for the button

		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btnSave, btnView, btnClear);
		return hBox;
	}

}
