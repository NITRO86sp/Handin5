package com.groupC;

public class Algorithm {
    public int augment(int flow, Edge[] P){
        int b=1;//bottleneck(P,flow); //TODO bottleneck implementation
        for (Edge e : P){
            if (e.isForward())
               e.addFlow(b);
            else
                e.addFlow(-b);

        }
        return flow;
    }
}
