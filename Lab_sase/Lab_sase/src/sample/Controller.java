package sample;

import javafx.fxml.FXML;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import static java.lang.System.exit;


public class Controller {
    public FlowPane configurationPanel;
    public TextField sizeField;
    public FlowPane controlPanel;
    public Button saveButton;
    public Button loadButton;
    public Button exitButton;
    public Button resetButton;
    public Canvas drawingPanel;
    public BorderPane borderPanel;
    public ChoiceBox choiceBox;
    public String circle;
    public String rectangle;


    public Controller() {

    }
    @FXML
    public void initialize()
    {
        exitButton.setOnMouseClicked(click -> {
            exit(0);
        });
        resetButton.setOnMouseClicked(click ->{
            drawingPanel.getGraphicsContext2D().clearRect(0,0,drawingPanel.getWidth(),drawingPanel.getHeight());
        });
        saveButton.setOnMouseClicked(click->{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save");
            File file = fileChooser.showSaveDialog(borderPanel.getScene().getWindow());

            SnapshotParameters sp = new SnapshotParameters();
            sp.setFill(Color.TRANSPARENT);

            WritableImage wi = new WritableImage((int)drawingPanel.getWidth(),(int)drawingPanel.getHeight());

            if(file!= null) {
                try {
                    ImageIO.write(SwingFXUtils.fromFXImage(drawingPanel.snapshot(sp, wi), null), "png", file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        loadButton.setOnMouseClicked(click ->{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Load");
            File file = fileChooser.showOpenDialog(borderPanel.getScene().getWindow());

            GraphicsContext gc = drawingPanel.getGraphicsContext2D();
            try {
                InputStream is =new FileInputStream(file);
                Image img = new Image(is);
                gc.drawImage(img,0,0,drawingPanel.getWidth(),drawingPanel.getHeight());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        });



            drawingPanel.setOnMouseClicked(click -> {
                String selection = (String) choiceBox.getSelectionModel().getSelectedItem();
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color randomColor = new Color(r, g, b,1);
                drawingPanel.getGraphicsContext2D().setFill(randomColor);


                if(selection.equals("Circle"))
                {
                    var x = click.getX();
                    var y = click.getY();
                    var width_str = sizeField.getText();
                    var width = Double.parseDouble(width_str);
                    var height_str = sizeField.getText();
                    var height = Double.parseDouble(height_str);
                    drawingPanel.getGraphicsContext2D().fillOval(x, y, width, height);
                }
                else
                {
                    var x = click.getX();
                    var y = click.getY();
                    var width_str = sizeField.getText();
                    var width = Double.parseDouble(width_str);
                    var height_str = sizeField.getText();
                    var height = Double.parseDouble(height_str);
                    drawingPanel.getGraphicsContext2D().fillRect(x, y, width, width);
                }

        });


           /* var width = Double.parseDouble(width_str);
       */
        //drawingPanel.getGraphicsContext2D().fillRect(x, y, width, width);


    }

}
