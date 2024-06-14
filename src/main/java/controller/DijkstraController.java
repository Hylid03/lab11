package controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;


public class DijkstraController {

    @FXML
    public RadioButton rbtn_AM;
    @FXML
    public RadioButton rbtn_AL;
    @FXML
    public RadioButton rbtn_LL;
    @FXML
    public TableView tblViewD;

    @FXML
    private void handleRandomizeButton() {
        List<List<Integer>> graph = new ArrayList<>();

        if (rbtn_AM.isSelected()) {
            graph = generateRandomAdjacencyMatrixGraph();
        } else if (rbtn_AL.isSelected()) {
            graph = generateRandomAdjacencyListGraph();
        } else if (rbtn_LL.isSelected()) {
            graph = generateRandomLinkedListGraph();
        } else {
            util.UtilityFX.alert("Error", "Graph type not selected."+"\n"+"Please select a graph type.");
        }

        List<Integer> shortestDistances = dijkstra(graph);

        updateTableView(shortestDistances);
    }

    private List<List<Integer>> generateRandomAdjacencyMatrixGraph() {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                if (i == j) {
                    row.add(0);
                } else {
                    row.add(util.Utility.getRandom(800));
                }
            }
            graph.add(row);
        }
        return graph;
    }

    private List<Integer> dijkstra(List<List<Integer>> graph) {
        // Implementa el algoritmo de Dijkstra aquí
        // Retorna una lista con las distancias más cortas desde el vértice inicial hasta cada vértice
        // por ejemplo: [0, 100, 300, ...]
        return null;
    }

    private void updateTableView(List<Integer> shortestDistances) {
        // Implementa la actualización del TableView aquí
    }
}