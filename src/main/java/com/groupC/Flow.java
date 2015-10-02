package com.groupC;

import java.io.File;
import java.util.Map;

public class Flow {
    private Map<String, Edge> edgeTable;
    private Map<String, Edge> reverseFlow;

    public static void main(String[] args) {
       //new Parser(args[0]).getMatrix();


        //TODO load the file to structure
        ClassLoader classLoader = Flow.class.getClassLoader();
        File file = new File(classLoader.getResource("rail.txt").getFile());

        Parser parser = new Parser(file);

        int[][] matrix = parser.getMatrix();
        //TODO algorithm computation

        //TODO output results
        System.out.println("Mark loves git and SourceTree");
    }

    public Edge getEdge(String a, String b) {
        if (a.compareTo(b) < 0)
            return edgeTable.get(a + b);
        return edgeTable.get(b + a);
    }

}
