package domain;

import domain.list.ListException;
import domain.queue.QueueException;
import domain.stack.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectedSinglyLinkedListGraphTest {

    @Test
    void test() {
        DirectedSinglyLinkedListGraph graph = new DirectedSinglyLinkedListGraph();
        try {
            graph.addVertex('A');
            graph.addVertex('B');
            graph.addVertex('C');
            graph.addVertex('D');
            graph.addVertex('E');
            graph.addVertex('F');
            graph.addVertex('G');
            graph.addVertex('H');

            graph.addEdgeWeight('A', 'B', 20);
            graph.addEdgeWeight('A', 'E', 15);
            graph.addEdgeWeight('B', 'C', 10);
            graph.addEdgeWeight('E', 'F', 30);
            graph.addEdgeWeight('C', 'D', 40);
            graph.addEdgeWeight('F', 'G', 5);
            graph.addEdgeWeight('G', 'H', 7);

            //lanza una excepción
            //graph.addEdgeWeight('G', 'K', 7);

            System.out.println(graph.toString());

            //Busqueda en Profundidad
            System.out.println("\nRECORRIDO CON EL ALGORITMO DFS (DEPTH FIRST SEARCH): "
                    +"\n"+graph.dfs());

            //Busqueda en Amplitud
            System.out.println("\nRECORRIDO CON EL ALGORITMO BFS (BREADTH FIRST SEARCH): "
                    +"\n"+graph.bfs());

        } catch (GraphException | ListException | StackException | QueueException e) {
            throw new RuntimeException(e);
        }

        //from here is the lab
         try{
             graph.clear();
             for (int i = 0; i < 5 ; i++) {
                 graph.addVertex(i+1);
             }
             graph.addEdgeWeight(1,1,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(1,2,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(1,3,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(1,4,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(1,5,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(2,1,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(2,2,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(2,4,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(4,4,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(4,5,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(4,2,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(4,3,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(3,4,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(3,3,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(5,1,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(5,4,util.Utility.getRandom(500)+500);
             graph.addEdgeWeight(5,5,util.Utility.getRandom(500)+500);



             System.out.println(graph);

             //Busqueda en Profundidad
             System.out.println("\nRECORRIDO CON EL ALGORITMO DFS (DEPTH FIRST SEARCH): "
                     +"\n"+graph.dfs());

             //Busqueda en Amplitud
             System.out.println("\nRECORRIDO CON EL ALGORITMO BFS (BREADTH FIRST SEARCH): "
                     +"\n"+graph.bfs());

             graph.removeEdge(2,1);
             graph.removeEdge(2,2);
             graph.removeEdge(2,4);
             graph.removeEdge(1,2);
             graph.removeEdge(4,2);
             graph.removeVertex(2);

             graph.removeEdge(4,4);
             graph.removeEdge(4,5);
             graph.removeEdge(4,3);
             graph.removeEdge(3,4);
             graph.removeEdge(1,4);
             graph.removeEdge(5,4);
             graph.removeVertex(4);

             graph.removeEdge(5,1);
             graph.removeEdge(5,5);
             graph.removeEdge(1,5);
             graph.removeVertex(5);

             System.out.println(graph);

         } catch (GraphException | ListException | StackException | QueueException e) {
             throw new RuntimeException(e);
         }

    }
}