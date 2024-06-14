package controller;

import domain.SinglyLinkedListGraph;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class DirectedGraphController {
    public TextArea txA_SLLGO;
    public TextArea txA_DSLLG;
    public Label lbl_Edge;
    public Label lbl_LinkedEdge;
    public TextArea txA_SLLG;
    SinglyLinkedListGraph sLLG= new SinglyLinkedListGraph();

    public void randomizeOnAction(ActionEvent actionEvent){

    }
    public void containsVertexOnAction(ActionEvent actionEvent){

    }
    public void dfsTourOnAction(ActionEvent actionEvent){

    }
    public void containsEdgeOnAction(ActionEvent actionEvent){

    }
    public void toStringOnAction(ActionEvent actionEvent){
        txA_DSLLG.setText(sLLG.toString());
    }
    public void bfsTourOnAction(ActionEvent actionEvent){

    }
}