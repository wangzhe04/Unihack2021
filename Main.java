package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
/**
 * @author Yibin Huang
 * @email huang448@wisc.edu
 * @Description This file contains the Main class to run the GUI
 */

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * This class contains objects to run the GUI
 **/
public class Main extends Application {
	// store any command-line arguments that were entered.
	// NOTE: this.getParameters().getRaw() will get these also
	private List<String> args;

	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 500;
	private static final String APP_TITLE = "Typhoon Data!";
	private static final String Months[] = { "Jan", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov",
			"Dec" };
	private static DataStorage dataStorage = new DataStorage();

	@Override
	/**
	 * this method contains the main objects of building GUI and show the data
	 */
	public void start(Stage primaryStage) throws Exception {
		// save args example
		args = this.getParameters().getRaw();
		// Main layout is Border Pane example (top,left,center,right,bottom)
		Pane root = new Pane();
		// Add the image
		Image image = new Image("file:///Users/huangyibin/Desktop/myworkspace/a2_milestone/taifen.png");
		ImageView imageView = new ImageView(image);
		// Set the image position
		imageView.setX(150);
		imageView.setY(80);
		// Set the image size
		imageView.setFitHeight(200);
		imageView.setFitWidth(200);
		imageView.setPreserveRatio(true);
		root.getChildren().add(imageView);
		
		Label title = new Label("Typhoon Analyzer: ");
		title.setLayoutX(200);
		title.setLayoutY(35);
		root.getChildren().add(title);
		
		
		Label latitudeL = new Label("Latitude: ");
		latitudeL.setLayoutX(50);
		latitudeL.setLayoutY(250);
		root.getChildren().add(latitudeL);
		// Create a new textField that allows input starting latitude
		TextField startLatitude = new TextField();
		startLatitude.setPrefSize(150, 25);
		startLatitude.setEditable(true);
		startLatitude.setAlignment(Pos.CENTER_LEFT);
		startLatitude.setPrefColumnCount(20);
		startLatitude.setPromptText("Please input start Latitude here");
		root.getChildren().add(startLatitude);
		startLatitude.setLayoutX(130);
		startLatitude.setLayoutY(250);
		// Create a new textField that allows input ending latitude
		TextField endLatitude = new TextField();
		endLatitude.setPrefSize(150, 25);
		endLatitude.setEditable(true);
		endLatitude.setAlignment(Pos.CENTER_LEFT);
		endLatitude.setPrefColumnCount(20);
		endLatitude.setPromptText("Please input end latitude here");
		root.getChildren().add(endLatitude);
		endLatitude.setLayoutX(300);
		endLatitude.setLayoutY(250);
		
		Label longL = new Label("Longtitude: ");
		longL.setLayoutX(50);
		longL.setLayoutY(300);
		root.getChildren().add(longL);
		// Create a new textField that allows input starting latitude
		TextField startingLong = new TextField();
		startingLong.setPrefSize(150, 25);
		startingLong.setEditable(true);
		startingLong.setAlignment(Pos.CENTER_LEFT);
		startingLong.setPrefColumnCount(20);
		startingLong.setPromptText("Please input start longtitude here");
		root.getChildren().add(startingLong);
		startingLong.setLayoutX(130);
		startingLong.setLayoutY(300);
		// Create a new textField that allows input ending latitude
		TextField endingLong = new TextField();
		endingLong.setPrefSize(150, 25);
		endingLong.setEditable(true);
		endingLong.setAlignment(Pos.CENTER_LEFT);
		endingLong.setPrefColumnCount(20);
		endingLong.setPromptText("Please input end longtitude here");
		root.getChildren().add(endingLong);
		endingLong.setLayoutX(300);
		endingLong.setLayoutY(300);
		
		Label timeL = new Label("Time: ");
		timeL.setLayoutX(50);
		timeL.setLayoutY(350);
		root.getChildren().add(timeL);
		// Create a new textField that allows input starting latitude
		TextField inputTime = new TextField();
		inputTime.setPrefSize(150, 25);
		inputTime.setEditable(true);
		inputTime.setAlignment(Pos.CENTER_LEFT);
		inputTime.setPrefColumnCount(20);
		inputTime.setPromptText("Please input time here");
		root.getChildren().add(inputTime);
		inputTime.setLayoutX(130);
		inputTime.setLayoutY(350);
		
		// Add search button
		Button searchR = new Button("Search");
		searchR.setPrefWidth(140);
		searchR.setLayoutX(180);
		searchR.setLayoutY(400);
		root.getChildren().add(searchR);
		
		
		

		EventHandler<ActionEvent> exitEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				try {
					primaryStage.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		
		EventHandler<ActionEvent> search = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				try {
					if(startLatitude.getText().isEmpty() || endLatitude.getText().isEmpty() ||
							startingLong.getText().isEmpty() || endingLong.getText().isEmpty() ||
							inputTime.getText().isEmpty()) {
						Label error = new Label("Must enter all information correctly");
						root.getChildren().add(error);
						error.relocate(145, 450);
					}
					
					else {
						typhoonTable(primaryStage, Double.parseDouble(startLatitude.getText()), 
								Double.parseDouble(endLatitude.getText()),
								Double.parseDouble(startingLong.getText()),Double.parseDouble(endingLong.getText()),
								Integer.parseInt(inputTime.getText()));
					}
				} catch (Exception e1) {
					Label error = new Label("The Typhoon does not exist");
					root.getChildren().add(error);
					error.relocate(135, 500);
				}
			}
		};
		
		searchR.setOnAction(search);

		
		// Add an exit button
		Button exitButton = new Button("Exit");
		exitButton.setPrefWidth(50);
		exitButton.setLayoutX(450);
		exitButton.setLayoutY(472);
		root.getChildren().add(exitButton);
		exitButton.setOnAction(e -> Platform.exit());
		Scene mainScene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		// Add the stuff and set the primary stage
		primaryStage.setTitle(APP_TITLE);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

	/**
	 * Show the table of annual report
	 * 
	 * @param stage
	 * @param startingLatitude
	 * @param year
	 * @throws Exception
	 */
	public void typhoonTable(Stage stage, double slat, double elat, 
			double slong, double elong, int year) throws Exception {
		
		// Create a table to show the data
		TableView tableView = new TableView();
		
		TableColumn<String, Typhoon> column1 = new TableColumn<>("ID");
		column1.setCellValueFactory(new PropertyValueFactory<>("ID"));
		
		TableColumn<String, Typhoon> column2 = new TableColumn<>("Year");
		column2.setCellValueFactory(new PropertyValueFactory<>("year"));
		
		TableColumn<String, Typhoon> column3 = new TableColumn<>("Month");
		column3.setCellValueFactory(new PropertyValueFactory<>("month"));
		
		TableColumn<String, Typhoon> column4 = new TableColumn<>("Latitude");
		column4.setCellValueFactory(new PropertyValueFactory<>("lat"));
		
		TableColumn<String, Typhoon> column5 = new TableColumn<>("Longtitude");
		column5.setCellValueFactory(new PropertyValueFactory<>("long"));
		
		TableColumn<String, Typhoon> column6 = new TableColumn<>("Pressure");
		column6.setCellValueFactory(new PropertyValueFactory<>("Prs"));
		
		TableColumn<String, Typhoon> column7 = new TableColumn<>("Wnd");
		column7.setCellValueFactory(new PropertyValueFactory<>("Wnd"));
		
		tableView.getColumns().add(column1);
		tableView.getColumns().add(column2);
		tableView.getColumns().add(column3);
		tableView.getColumns().add(column4);
		tableView.getColumns().add(column5);
		tableView.getColumns().add(column6);
		tableView.getColumns().add(column7);
		
		ArrayList<String> tIDs = dataStorage.getID(slat, elat, slong, elong, year);
	
		int Asize = tIDs.size();
		
		System.out.println(Asize);
		
		for(int i = 0; i < Asize; i++) {
			
			tableView.getItems()
			.add(new Typhoon(dataStorage.get(tIDs.get(i)).getID() , 
					dataStorage.get(tIDs.get(i)).getYear(), 
					dataStorage.get(tIDs.get(i)).getMonth(),
					dataStorage.get(tIDs.get(i)).getLat(),
					dataStorage.get(tIDs.get(i)).getLong(),
					dataStorage.get(tIDs.get(i)).getPrs(),
					dataStorage.get(tIDs.get(i)).getWnd()
					)
					);
		}
		
		Label note = new Label("click each column's title to sort(ascending / descending) ");
		
		VBox vbox = new VBox(note, tableView);
		Scene scene = new Scene(vbox);
		Stage farmData = new Stage();
		farmData.setHeight(400);
		farmData.setWidth(400);
		farmData.setTitle("Year: " + year);
		farmData.setScene(scene);
		farmData.show();
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File ("/Users/huangyibin/Desktop/myworkspace/a2_milestone/data.csv");
		
		try {
			FileManager a = new FileManager(file, dataStorage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		launch(args);
		
	}

}
