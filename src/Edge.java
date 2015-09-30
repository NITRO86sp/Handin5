/**
 * Created by Stelios on 30/9/2015.
 */
public class Edge {
    Node a, b;
    int Capacity, current, rest;


    public Edge(Node a, Node b, int C){
        this.a=a;
        this.b=b;
        Capacity=C;
        current=0;
        rest=0;
    }
}
