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
		// 1 call ttt fronm normal method
//		spiele.tictactoe.TicTacToeGuiStageStart test = new spiele.tictactoe.TicTacToeGuiStageStart();
//		try 
//		{
//			test.startMethod();
//		} 
//		catch (IOException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 2 call ttt from aplication class
//		spiele.tictactoe.TicTacToeGuiStage test2 = new spiele.tictactoe.TicTacToeGuiStage();
//		try 
//		{
//			test2.init();
//		} 
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 3 call ttt from main stage -.-
//		spiele.tictactoe.TicTacToeGuiStageStart test3 = new spiele.tictactoe.TicTacToeGuiStageStart();
//		try
//		{
//			test3.startMethod();
//		} 
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		// 4
//		String tictactoeGuiPath = "/spiele.tictactoe/FXgui.fxml";
//		//tictactoeGuiPath = "FXgui.fxml";
//		try {
//			Main.mainMenu = FXMLLoader.load(getClass().getResource(tictactoeGuiPath));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 5
		

		
		TicTacToeGuiStageStart test = TicTacToeGuiStageStart.getTicTacToeGuiStage();
		try 
		{
			Main.mainApplicationStage.hide();		
//			Main.mainMenu.close();
			test.startMethod();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Main.mainMenu.show();
	}
	
	
}
