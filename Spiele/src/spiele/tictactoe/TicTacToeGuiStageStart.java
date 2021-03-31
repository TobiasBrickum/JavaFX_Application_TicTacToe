package spiele.tictactoe;

import java.io.IOException;

import application.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

// i create a singleton because i will work with get and set methods

public class TicTacToeGuiStageStart
{
	
	//#####	attributes #########################################
	private static TicTacToeGuiStageStart ticTacToeGuiStageMain = null;
	
	private String FXMLGuiPathGameTicTacToe; 
	private Stage stageGameTicTacToe;
	private Scene sceneGameTicTactoe;
	

	//#####	constructors #########################################
	private TicTacToeGuiStageStart() {}
	
	//##### methods #########################################

	// singleton
	public static TicTacToeGuiStageStart getTicTacToeGuiStage()
	{
		if(ticTacToeGuiStageMain == null)
		{
			ticTacToeGuiStageMain = new TicTacToeGuiStageStart();
			System.out.println("createt once");
		}
		
		return ticTacToeGuiStageMain;
	}
	
	//#####	get and set methods #########################################
	
	public Stage getStageGameTicTacToe() 
	{ 
		return stageGameTicTacToe;
	}

	public void setStageGameTicTacToe(Stage stageGameTicTacToe) 
	{
		this.stageGameTicTacToe = stageGameTicTacToe;
	}
	
	public Scene getSceneGameTicTactoe() 
	{
		return sceneGameTicTactoe;
	}

	public void setSceneGameTicTactoe(Scene sceneGameTicTactoe) 
	{
		this.sceneGameTicTactoe = sceneGameTicTactoe;
	}
	
	//#####	normal methods #########################################

	public void startMethod() throws IOException 
	{
//		// work not
//		// problem: Application launch must not be called more than once
//		Application.launch(TicTacToeGuiStage.class);
		
		// work
		this.FXMLGuiPathGameTicTacToe = "/spiele/tictactoe/view/FXgui.fxml";
		this.stageGameTicTacToe = FXMLLoader.load(getClass().getResource(this.FXMLGuiPathGameTicTacToe));
		this.sceneGameTicTactoe = this.stageGameTicTacToe.getScene();
		
		//Scene a = this.stageGameTicTacToe.getScene();
		
		this.stageGameTicTacToe.show();	
		
		System.out.println("create more");
	}
	
}
