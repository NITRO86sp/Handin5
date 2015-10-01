import java.util.Map;

public class Flow {
    private Map<String, Edge> edgeTable;
    private Map<String, Edge> reverseFlow;

    public static void main(String[] args) {
       new Parser(args[0]).getMatrix();


        //TODO load the file to structure

        //TODO algorithm computation

        //TODO output results
    }

    public Edge getEdge(String a, String b) {
        if (a.compareTo(b) < 0)
            return edgeTable.get(a + b);
        return edgeTable.get(b + a);
    }

}
