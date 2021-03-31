package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application 
{
	//#####	attributes #########################################
	public static Stage mainApplicationStage;
	
	//#####	methods #########################################
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			String mainMenuGuiPath = "/application/view/FXgui.fxml";
			mainApplicationStage = FXMLLoader.load(getClass().getResource(mainMenuGuiPath));
			primaryStage = mainApplicationStage;
			primaryStage.show();
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws Exception 
	{
	}

	@Override
	public void stop() throws Exception 
	{
	}
	
	// close application, should replace with event / 
	public static void stopApplication()
	{
	   Platform.exit();
       //System.exit(0);
	}
	
}
