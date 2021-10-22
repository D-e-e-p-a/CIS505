package Module_8;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class NatarajanEnhancedFutureValueApp extends Application {

	private Label lblMonthlyPayment = new Label("Monthly Payment");
	private Label lblInterestRate = new Label("Interest Rate");
	private Label lblInterestRateFormat = new Label();
	private Label year = new Label("Years");
	
	private Button btnClear = new Button("Clear");
	private Button btnCalculator = new Button("Calculate");
	
	private ComboBox<Integer> listBox = new ComboBox<>();
	
	private TextField mpayment = new TextField();
	private TextField iRate = new TextField();
	private TextArea textArea = new TextArea();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primarystage) throws Exception {

		// create Grid pane and to set properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// InterestlabelFormat
		lblInterestRateFormat.setText("Enter 11.1% as 11.1");
		lblInterestRateFormat.setTextFill(Color.RED.darker());
	
		// Drop down using combobox
		listBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// SettingControl time

		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		Text text = new Text("Calculation as of " + date.format(formatter));

		// place nodes in the pane
		pane.add(lblMonthlyPayment, 0, 0);
		pane.add(mpayment, 1, 0);
		pane.add(lblInterestRate, 0, 1);
		pane.add(iRate, 1, 1);
		pane.add(lblInterestRateFormat, 1, 2);
		GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
		pane.add(year, 0, 3);
		pane.add(listBox, 1, 3);
		pane.add(getHbox(), 1, 4);// created a private method to get the actionBtnContainer
		pane.add(text, 0, 5);

		// this is the outer pane
		BorderPane bpane = new BorderPane();

		// adding the inner grid pane to the border pane
		bpane.setTop(pane);
		bpane.setBottom(getVbox());// created a private method to get the text area box

		//EventHandler
		btnClear.setOnAction(e -> clearFormFields());
		btnCalculator.setOnAction(e -> calculateResults());

		// create scene and place it in the stage
		Scene scene = new Scene(bpane);
		primarystage.setTitle("Future Value App");
		primarystage.setScene(scene);
		primarystage.show();

	}

	private Node getVbox() {

		// text area
		textArea.setPrefColumnCount(15);
		textArea.setPrefRowCount(5);
		textArea.setWrapText(true);
		textArea.setFont(Font.font("Times", 12));

		VBox txt = new VBox();
		txt.setPadding(new Insets(15, 15, 15, 15));
		txt.setSpacing(10);
		txt.getChildren().add(textArea);

		return txt;
	}

	private Node getHbox() {
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(btnClear);
		actionBtnContainer.getChildren().add(btnCalculator);

		return actionBtnContainer;
	}

	private void clearFormFields() {
		mpayment.clear();
		iRate.clear();
		textArea.clear();
		listBox.getSelectionModel().clearSelection();

	}

	private void calculateResults() {
		double monthlyPayment = Double.parseDouble(mpayment.getText());
		double IntrestRate = Double.parseDouble(iRate.getText());
		// Integer intValueInteger = listBox.getValue();
		int yrs = listBox.getValue().intValue();
		double fValue = FinanceCalculator.calculateFutureValue(monthlyPayment, IntrestRate, yrs);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		textArea.setText("The future value is " + (formatter.format(fValue)));

	}

}
