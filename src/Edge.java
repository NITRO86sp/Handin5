
public class Edge {
    Node a, b;
    int capacity, current, rest;


    public Edge(Node a, Node b, int C){
        this.a=a;
        this.b=b;
        capacity=C;
        current=0;
        rest=0;
    }
    
    public int getCapacity(){
        return capacity;
    }

    public int getCurrent(){
        return current;
    }

    public int getRest(){
        return rest;
    }

    public boolean canAdd(int diff){
        if (current+diff>capacity || current+diff<0)
            return false;
        return true;
    }

    public boolean addFlow(int diff){
        if (current+diff>capacity || current+diff<0)
            return false;
        else{
            current+=diff;
            rest-=diff;
            return true;
        }
    }
}
