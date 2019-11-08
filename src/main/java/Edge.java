public class Edge {
    private double cost;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(double cost, Vertex startVertex, Vertex targetVertex) {
        this.cost = cost;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}
