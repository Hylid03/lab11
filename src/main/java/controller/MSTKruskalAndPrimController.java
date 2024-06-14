package controller;

import domain.list.SinglyLinkedList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class MSTKruskalAndPrimController {
    public Button btn_MST;
    public RadioButton rbtn_Matrix;
    public RadioButton rbtn_List;
    public RadioButton rbtn_LinkedList;
    public RadioButton rbtn_Kruskal;
    public RadioButton rbtn_Prim;

    public void randomizeOnAction(ActionEvent actionEvent){
        List<List<Integer>> graph = new ArrayList<>();

        if (rbtn_LinkedList.isSelected()) {
            graph = generateRandomAdjacencyMatrixGraph();
        } else if (rbtn_Matrix.isSelected()) {
            graph = generateRandomAdjacencyListGraph();
        } else if (rbtn_List.isSelected()) {
            graph = generateRandomLinkedListGraph();
        } else {
            util.UtilityFX.alert("Error", "Graph type not selected."+"\n"+"Please select a graph type.");
        }

    }

    private SinglyLinkedList generateRandomLinkedListGraph() {
        SinglyLinkedList graph = new SinglyLinkedList();
        for (int i = 0; i < 100; i++) {
            SinglyLinkedList row = new SinglyLinkedList();
            for (int j = 0; j < 100; j++) {
                if (i == j) {
                    row.add(0); // No self-loops
                } else {
                    row.add(util.Utility.getRandom(800)); // Random weight between 0 and 799
                }
            }
            graph.add(row);
        }
        return graph;
    }

    private List<List<Integer>> generateRandomAdjacencyListGraph() {
        return null;
    }

    private List<List<Integer>> generateRandomAdjacencyMatrixGraph() {
        return null;
    }
}
