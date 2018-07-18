/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.sun.javafx.geom.Line2D;
import com.sun.prism.BasicStroke;
import java.awt.event.MouseEvent;
import javafx.fxml.Initializable;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;
import java.util.Spliterator;
import java.util.function.Consumer;
import javafx.animation.PathTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Shape;
import java.awt.geom.Line2D.Double;
import java.util.ArrayList;
import javafx.scene.shape.Line;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author SQ
 */
public class MainViewController implements Initializable {

    
    
    
   @FXML
    private GridPane grid;

    @FXML
    private ImageView rocket;

    @FXML
    private Button lionbtn;

    @FXML
    private ImageView lion;

    @FXML
    private Button cowbtn;

    @FXML
    private ImageView cow;

    @FXML
    private Button grainbtn;

    @FXML
    private ImageView grain;

    @FXML
    private Button human1btn;

    @FXML
    private ImageView human1;

    @FXML
    private Button human2btn;

    @FXML
    private ImageView human2;
    
    @FXML
    private Button refreshbtn;
    
    @FXML
    private Button launchbtn;
    /**
     * Initializes the controller class.
     */
    
    private int itemCounter = 0;
    private ArrayList<Node> itemsOnBoard = new ArrayList<Node>();
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
     cowbtn.setBackground(Background.EMPTY);
     lionbtn.setBackground(Background.EMPTY);
     grainbtn.setBackground(Background.EMPTY);
     human1btn.setBackground(Background.EMPTY);
     human2btn.setBackground(Background.EMPTY);

     cowbtn.setBackground(Background.EMPTY);
     lionbtn.setBackground(Background.EMPTY);
     grainbtn.setBackground(Background.EMPTY);
     human1btn.setBackground(Background.EMPTY);
     human2btn.setBackground(Background.EMPTY);

     refreshbtn.setOnAction((ActionEvent event) -> {
           System.out.println("refreshbtn pressed");
           
            grid.getChildren().remove(cowbtn);
            grid.getChildren().remove(lionbtn);
            grid.getChildren().remove(grainbtn);
            grid.getChildren().remove(human1btn);
            grid.getChildren().remove(human2btn);
                
            grid.add(cowbtn, 1,4);
            grid.add(lionbtn, 2,4);
            grid.add(grainbtn, 3,4);
            grid.add(human1btn, 1,5);
            grid.add(human2btn, 2,5);
                  
            itemCounter = 0;
            itemsOnBoard.clear();
        });
     
        
      
      launchbtn.setOnAction((ActionEvent event) -> {
     
          
            rocketLaunch(rocket, itemsOnBoard, grid);
            //Creating the MoveTo path element 
                
		
            
      });
      
   
//    if(getNodeByColumnRowIndex(2, 1, grid) != null){
//       cowbtn.setOnAction((ActionEvent event) -> {
//           System.out.println("cowbtn pressed222");
//           grid.getChildren().remove(cowbtn);
//           
//           grid.add(cowbtn, 1,4);
//        });
//     }
   // if(getNodeByColumnRowIndex(1, 4, grid) != null){ // col, row
  
       cowbtn.setOnAction((ActionEvent event) -> {
               
           System.out.println("cowbtn pressed");
           
           
            if(itemCounter == 0){
                grid.getChildren().remove(cowbtn);
                grid.add(cowbtn,2, 1); // col , row
                itemsOnBoard.add(cowbtn);
            }
            else if(itemCounter == 1){
                grid.getChildren().remove(cowbtn);
                grid.add(cowbtn,3, 1); // col , row
                itemsOnBoard.add(cowbtn);

            }      
            
           itemCounter++;
        });
       
        lionbtn.setOnAction((ActionEvent event) -> {
               
           System.out.println("lionbtn pressed");
           
           
            if(itemCounter == 0){
                grid.getChildren().remove(lionbtn);
                grid.add(lionbtn,2, 1); // col , row
                itemsOnBoard.add(lionbtn);
                
            }
            else if(itemCounter == 1){
                grid.getChildren().remove(lionbtn);
                grid.add(lionbtn,3, 1); // col , row
                itemsOnBoard.add(lionbtn);

            }      
            
           itemCounter++;
        });
       
          grainbtn.setOnAction((ActionEvent event) -> {
               
           System.out.println("grainbtn pressed");
           
           
            if(itemCounter == 0){
                grid.getChildren().remove(grainbtn);
                grid.add(grainbtn,2, 1); // col , row
                itemsOnBoard.add(grainbtn);

            }
            else if(itemCounter == 1){
                grid.getChildren().remove(grainbtn);
                grid.add(grainbtn,3, 1); // col , row
                itemsOnBoard.add(grainbtn);

            }      
            
           itemCounter++;
        });
       
           human1btn.setOnAction((ActionEvent event) -> {
               
           System.out.println("human1btn pressed");
           
           
            if(itemCounter == 0){
                grid.getChildren().remove(human1btn);
                grid.add(human1btn,2, 1); // col , row
                itemsOnBoard.add(human1btn);

            }
            else if(itemCounter == 1){
                grid.getChildren().remove(human1btn);
                grid.add(human1btn,3, 1); // col , row
                itemsOnBoard.add(human1btn);

            }      
            
           itemCounter++;
        });
       
            human2btn.setOnAction((ActionEvent event) -> {
               
           System.out.println("human2btn pressed");
           
           
            if(itemCounter == 0){
                grid.getChildren().remove(human2btn);
                grid.add(human2btn,2, 1); // col , row
                itemsOnBoard.add(human2btn);

            }
            else if(itemCounter == 1){
                grid.getChildren().remove(human2btn);
                grid.add(human2btn,3, 1); // col , row
                itemsOnBoard.add(human2btn);

            }      
            
           itemCounter++;
        });
       
  
     
    
//     lion.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//
//     @Override
//     public void handle(MouseEvent event) {
//         System.out.println("Tile pressed ");
//         event.consume();
//     }
//});
        
        
        
    }    
    
      public void rocketLaunch(Node rocket, ArrayList<Node> itemsOnBoard, GridPane grid){
       
       // Create the Path
        Line line = new Line();
        line.setStartX(rocket.getScaleX() + 60);
        line.setStartY(rocket.getScaleY() + 35);
        line.setEndX(350);
        line.setEndY(50);
       // Set up a Path Transition for the Rectangle
       
       PathTransition trans = new PathTransition(Duration.seconds(2), line, rocket);
       
       trans.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
       
//       if(itemsOnBoard != null){
        PathTransition trans1 = new PathTransition(Duration.seconds(2), line, itemsOnBoard.get(0));
        PathTransition trans2 = new PathTransition(Duration.seconds(2), line, itemsOnBoard.get(1));

        trans1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
        trans2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
        trans1.play();
        trans2.play();
//       }
       // Play the Animation
       
       trans.play();
     
//      if(itemsOnBoard != null){

      
       trans.setOnFinished((ActionEvent event) -> {
            Node temp = itemsOnBoard.get(0);
            Node temp1 = itemsOnBoard.get(1);
             grid.getChildren().remove(temp);
             grid.getChildren().remove(temp1);
             
           

            if(temp == cowbtn || temp1 == cowbtn){
                  grid.add(cowbtn,2, 3); // col , row
             }
             if(temp == lionbtn || temp1 == lionbtn){
                   grid.add(lionbtn,3, 3); // col , row

             }
             if(temp == grainbtn || temp1 == grainbtn){
                   grid.add(grainbtn,4, 3); // col , row

             }
             if(temp == human1btn || temp1 == human1btn){
                   grid.add(human1btn,2, 4); // col , row

             } 
             if(temp == human2btn || temp1 == human2btn){
                   grid.add(human2btn,3, 4); // col , row

             }
       
//      }
          });
   }
      
      
    public Node getNodeByColumnRowIndex (final int column,final int row, GridPane gridPane) {
    Node result = null;
    ObservableList<Node> childrens = gridPane.getChildren();

    for (Node node : childrens) {
        if(GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
            result = node;
            break;
        }
    }

    return result;
}

}
