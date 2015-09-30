
public class Algorithm {
    public int augment(int flow, Edge[] P){
        int b=bottleneck(P,flow);
        for (Edge e : P){
            if (e.isForward())
               e.addFlow(b);
            else
                e.addFlow(-b);

        }
        return flow;
    }
}
