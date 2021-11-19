package GradeBookApp;

/*
References:

Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.
*/
import javafx.application.Application;

import javafx.stage.Stage;

public class NatarajanGradeBookApp extends Application {

	public static void main(String[] args) throws Exception {
		launch(args);

	}

	// calls the object from the GradeBook class and start method of its own
	// this set is just for the clean look on the app/start page.
	@Override
	public void start(Stage primaryStage) throws Exception {
		new GradeBook().start(primaryStage);

	}

}
