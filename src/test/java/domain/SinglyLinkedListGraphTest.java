package domain;

import domain.list.ListException;
import domain.queue.QueueException;
import domain.stack.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SinglyLinkedListGraphTest {

    @Test
    void test() {
        SinglyLinkedListGraph graph = new SinglyLinkedListGraph();
        try {
            graph.addVertex('A');
            graph.addVertex('B');
            graph.addVertex('C');
            graph.addVertex('D');
            graph.addVertex('E');
            graph.addVertex('F');
            graph.addVertex('G');
            graph.addVertex('H');
            graph.addVertex('I');
            graph.addVertex('J');

            graph.addEdgeWeight('A', 'B', "Cris");
            graph.addEdgeWeight('A', 'C', "Gill");
            graph.addEdgeWeight('A', 'D', "Bella");
            graph.addEdgeWeight('B', 'F', "Jay");
            graph.addEdgeWeight('F', 'E', "Camila");
            graph.addEdgeWeight('F', 'J', "Juan");
            graph.addEdgeWeight('C', 'G', "Sevika");
            graph.addEdgeWeight('G', 'J', "Tao");
            graph.addEdgeWeight('D', 'H', "Mich");
            graph.addEdgeWeight('H', 'I', "Millo");
            graph.addEdgeWeight('H', 'J', "Lui");

            System.out.println(graph);



            //Busqueda en Profundidad
            System.out.println("\nRECORRIDO CON EL ALGORITMO DFS (DEPTH FIRST SEARCH): "
                    +"\n"+graph.dfs());

            //Busqueda en Amplitud
            System.out.println("\nRECORRIDO CON EL ALGORITMO BFS (BREADTH FIRST SEARCH): "
                    +"\n"+graph.bfs());

            graph.removeEdge('B','F');
            graph.removeEdge('F','E');
            graph.removeEdge('F','J');
            graph.removeEdge('H','I');
            graph.removeEdge('H','J');
            graph.removeEdge('B','F');

            graph.removeVertex('F');
            graph.removeVertex('H');
            graph.removeVertex('J');

            System.out.println("\nRECORRIDO CON EL ALGORITMO DFS (DEPTH FIRST SEARCH): "
                    +"\n"+graph.dfs());
            //Busqueda en Amplitud
            System.out.println("\nRECORRIDO CON EL ALGORITMO BFS (BREADTH FIRST SEARCH): "
                    +"\n"+graph.bfs());
            System.out.println(graph);

        } catch (GraphException | ListException | StackException | QueueException e) {
            throw new RuntimeException(e);
        }
    }
}