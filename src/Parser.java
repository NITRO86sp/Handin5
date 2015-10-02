import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

    private Scanner sc;
    private int[][] Adj;

    public Parser(String filepath) {

        try {
            sc = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        extractNodes();
        extractEdges();
        System.out.println(Adj[5][7]);

    }


    private Node[] extractNodes() {
        sc.useDelimiter("\\r");
        int numberOfNodes = Integer.parseInt(sc.next());
        Node[] nodes = new Node[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            nodes[i] = new Node(sc.next().trim(), i);
        }
        return nodes;
    }

    private int[][] extractEdges() {

        int numberOfEdges = Integer.parseInt(sc.next().trim());

        Adj = new int[numberOfEdges][numberOfEdges];
        sc.useDelimiter("\\r");
        while (sc.hasNext("\\n\\d.*")) {
            String scCurrent = sc.next().trim();
            String[] edgeElements = scCurrent.split(" ");
            Adj[Integer.parseInt(edgeElements[0])][Integer.parseInt(edgeElements[1])] = Integer.parseInt(edgeElements[2]);

        }
        return Adj;
    }

    public int[][] getMatrix() {
        return Adj;
    }

}
