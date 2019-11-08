class Main {
    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        a.addNeighbour(new Edge(1, a, b));
        a.addNeighbour(new Edge(8, a, d));
        b.addNeighbour(new Edge(5, b, c));
        c.addNeighbour(new Edge(3, c, d));
        d.addNeighbour(new Edge(1, d, e));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(b);
        System.out.println(dijkstra.getShortestPathTo(d));

    }
}