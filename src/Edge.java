
public class Edge {
    Node a, b;
    int capacity, flow, residualFlow;


    public Edge(Node a, Node b, int C){
        this.a=a;
        this.b=b;
        capacity=C;
        flow =0;
        residualFlow =0;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getFlow(){
        return flow;
    }

    public int getResidualFlow(){
        return residualFlow;
    }

    public boolean canAdd(int diff){
        if (flow +diff>capacity || flow +diff<0)
            return false;
        return true;
    }

    public boolean addFlow(int diff){
        if (flow +diff>capacity || flow +diff<0)
            return false;
        else{
            flow +=diff;
            residualFlow -=diff;
            return true;
        }
    }

    public boolean isForward(){
        if (flow >= residualFlow)
            return true;
        return false;
    }

    public int getANode(){
        return a.getID();
    }

    public Node getA() {
        return a;
    }

    public Node getB() {
        return b;
    }
}
