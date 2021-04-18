package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import spiele.tictactoe.TicTacToeGuiStageStart;

public class Controller 
{
	//#####	Events	#####################################################################
	
	@FXML
	private void btnPlayTicTacToeClicked(ActionEvent event)
	{	
//		// 1
//		// currently useless
//		TicTacToeGuiStageStart test = TicTacToeGuiStageStart.getTicTacToeGuiStage();
//		try 
//		{
//			Main.mainApplicationStage.hide();		
////			Main.mainMenu.close();
//			test.startMethod();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		//Main.mainMenu.show();
		
		
		// 2
		// change test.startMethod(); in constructor
		TicTacToeGuiStageStart test = TicTacToeGuiStageStart.getTicTacToeGuiStage();
		Main.mainApplicationStage.hide();		
//		Main.mainMenu.close();

	
		//Main.mainMenu.show();
	
	
	}	
}
