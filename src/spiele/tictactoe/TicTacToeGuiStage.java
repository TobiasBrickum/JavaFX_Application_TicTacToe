package spiele.tictactoe;

import application.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

// current useless because
// problem: Application launch must not be called more than once
public class TicTacToeGuiStage extends Application
{
	//#####	attributes #########################################
	
	protected String tictactoeFXMLGuiPath; 
	protected Stage stageGameTicTacToe;
	
	//#####	methods #########################################
	
	@Override
	public void init() throws Exception 
	{
		this.tictactoeFXMLGuiPath = "/spiele/tictactoe/view/FXgui.fxml";
		this.stageGameTicTacToe = FXMLLoader.load(getClass().getResource(tictactoeFXMLGuiPath));
			
		System.out.println("work");
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage = this.stageGameTicTacToe;
		primaryStage.focusedProperty();
		primaryStage.show();	
	}


	@Override
	public void stop() throws Exception
	{
		
	}
	
}
