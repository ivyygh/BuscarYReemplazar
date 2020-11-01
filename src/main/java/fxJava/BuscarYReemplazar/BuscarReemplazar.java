package fxJava.BuscarYReemplazar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BuscarReemplazar extends Application {

	private Label Buscar;
	private TextField buscarText;
	private Button buscarButton;
	private Label Reemplazar;
	private TextField reempText;
	private Button reempButton;
	private Button reemTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Buscar = new Label("Buscar:  ");
		buscarText = new TextField();
		buscarText.setMaxWidth(500);
		buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(100);
		
		Reemplazar = new Label("Reemplazar por:  ");
		reempText = new TextField();
		reempText.setMaxWidth(500);
		reempButton = new Button("Reemplazar");
		reempButton.setMaxWidth(100);
		
		reemTodoButton = new Button("Reemplazar todo");
		reemTodoButton.setMaxWidth(100);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(100);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(100);
		
		CheckBox MayMin = new CheckBox("Mayúsculas y minúsculas");
		MayMin.setMaxWidth(500);
		
		CheckBox BusAtras = new CheckBox("Buscar hacia atrás");
		BusAtras.setMaxWidth(500);
		
		CheckBox ExpReg = new CheckBox("Expresión regular");
		ExpReg.setMaxWidth(500);
		
		CheckBox Resaltar = new CheckBox("Resaltar resultados");
		Resaltar.setMaxWidth(500);
		
		HBox hUno = new HBox();
		hUno.setSpacing(5);
		hUno.getChildren().addAll(Buscar, buscarText, buscarButton);
		
		HBox hDos = new HBox();
		hDos.setSpacing(5);
		hDos.getChildren().addAll(Reemplazar, reempText, reempButton);
		
		HBox hTres = new HBox(MayMin, BusAtras, reemTodoButton);
		hTres.setSpacing(5);
		
		HBox hCuatro = new HBox(ExpReg, Resaltar, cerrarButton);
		hCuatro.setSpacing(5);
		
		HBox hCinco = new HBox();
		hCinco.setSpacing(5);
		hCinco.getChildren().addAll(ayudaButton);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.getChildren().addAll(hUno, hDos, hTres, hCuatro, hCinco);
		
		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}