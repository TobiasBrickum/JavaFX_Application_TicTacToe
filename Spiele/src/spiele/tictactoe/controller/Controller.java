package spiele.tictactoe.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import spiele.tictactoe.TicTacToeGuiStageStart;
import javafx.application.Application;
import javafx.application.Platform;

public class Controller 
{
	//#####	field	#####################################################################
	private String fxmlPathMatchfield = "/spiele/tictactoe/view/FXSceneMatchField.fxml";
	
	private TicTacToeGuiStageStart tictactoe = TicTacToeGuiStageStart.getTicTacToeGuiStage();
	private Stage stage = tictactoe.getStageGameTicTacToe();
	private Scene scene = tictactoe.getSceneGameTicTactoe();
	
	@FXML private BorderPane borderTest;
	
	//#####	Events	#####################################################################
	
	@FXML
	private void btnBackToMainMenu(ActionEvent event)
	{
		// close TicTacToe Gui View
		this.stage.close();
		
		// show application main view
		Main.mainApplicationStage.show();
	}
	
	@FXML
	private void btnCloseApplication(ActionEvent event)
	{
		// close the entire application 
		Main.stopApplication();
	}
	
	@FXML
	private void btnPlayerVSPlayer(ActionEvent event) throws IOException
	{
		this.borderTest.setCenter(FXMLLoader.load(getClass().getResource(this.fxmlPathMatchfield)));
	}
	
	
	
	
	
}
