import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    private String name;
    private List<Edge> edges;
    private boolean visited;
    private Vertex previousVertex;
    private double minDistance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.edges.add(edge);
    }

    public String getName() {
        return this.name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getpreviousVertex() {
        return previousVertex;
    }

    public void setpreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }

    @Override
    public String toString() {
        return name;
    }
}
