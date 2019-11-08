import java.util.*;

class Dijkstra {
    public List<Vertex> vertices;
    public List<Edge> edges;

    public void computePath(Vertex sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {

            // Remove source vertex from queue
            Vertex vertex = priorityQueue.poll();

            for (Edge edge : vertex.getEdges()) {
                Vertex v = edge.getTargetVertex();
                double cost = edge.getCost();
                double minDistance = vertex.getMinDistance() + cost;

                if (minDistance < v.getMinDistance()) {
                    priorityQueue.remove(vertex);
                    v.setpreviousVertex(vertex);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }
    public Vertex findVertex(String name) {
        for (Vertex vertex : this.vertices) {
            if (vertex.getName().equals(name)) {
                return vertex;
            }
        }
        return null;
    }

    public Vertex createVertex(String name) {
        if (this.vertices == null) {
            this.vertices = new LinkedList<Vertex>();
        }
        Vertex vertex = new Vertex(name);

        this.vertices.add(vertex);
        return vertex;
    }

    public Edge createEdge(double cost, Vertex a, Vertex b) {
        if (this.edges == null) {
            this.edges = new LinkedList<Edge>();
        }
        Edge edge = new Edge(cost, a, b);
        this.edges.add(edge);
        return edge;
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getpreviousVertex()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }
}
