import org.junit.Test;

import static org.junit.Assert.*;

public class TestDijkstra {

    public Dijkstra testDijkstra = new Dijkstra();

    public void createGraph() {
        Vertex a = this.testDijkstra.createVertex("A");
        Vertex b = this.testDijkstra.createVertex("B");
        Vertex c = this.testDijkstra.createVertex("C");
        Vertex d = this.testDijkstra.createVertex("D");
        Vertex e = this.testDijkstra.createVertex("E");

        a.addNeighbour(this.testDijkstra.createEdge(1, a, b));
        a.addNeighbour(this.testDijkstra.createEdge(8, a, d));
        b.addNeighbour(this.testDijkstra.createEdge(5, b, c));
        c.addNeighbour(this.testDijkstra.createEdge(3, c, d));
        d.addNeighbour(this.testDijkstra.createEdge(1, d, e));

        this.testDijkstra.computePath(a);
    }

    @Test
    public void testMethodGetShortestPathToReturnsCorrectPath() {
        this.createGraph();
        assertEquals("[A, D, E]", testDijkstra.getShortestPathTo(testDijkstra.findVertex("E")).toString());
    }

    @Test
    public void testReturnNullOnFindingNonExistingVertex() {
        this.createGraph();
        assertNull(testDijkstra.findVertex("F"));
    }




}
