import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by markd_000 on 30/09/2015.
 */
public class Parser {

    private Scanner sc;
    private Node[] nodesList;

    public Parser(String filepath) {

        try {
            sc = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void parse() {
        Node[] extractedNodes = extractNodes();
        for (Node extractedNode : extractedNodes) System.out.print(extractedNode.name + " ");

        Edge[] extractedEdges = extractEdges();
        for (Edge extractedEdge : extractedEdges) System.out.print(extractedEdge.capacity + " ");


    }


    private Node[] extractNodes() {
        sc.useDelimiter("\\r");
        int numberOfNodes = Integer.parseInt(sc.next());
        nodesList = new Node[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            nodesList[i] = new Node(sc.next().trim());
        }
        return nodesList;
    }

    private Edge[] extractEdges() {

        int numberOfEdges = Integer.parseInt(sc.next().trim());
        Edge[] edges = new Edge[numberOfEdges];
        int i = 0;
        sc.useDelimiter("\\r");
        while (sc.hasNext("\\n\\d.*")) {
            String scCurrent = sc.next().trim();
            String[] edgeElements = scCurrent.split(" ");
            edges[i] = new Edge(nodesList[Integer.parseInt(edgeElements[0].trim())],
                    nodesList[Integer.parseInt(edgeElements[1].trim())],
                    Integer.parseInt(edgeElements[2].trim()));
            i++;

        }
        return edges;
    }

}
