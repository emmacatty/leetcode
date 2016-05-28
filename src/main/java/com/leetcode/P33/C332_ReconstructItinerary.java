package com.leetcode.P33;

import java.util.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-20
 */
public class C332_ReconstructItinerary {
    private Map<String, List<String>> graph = new HashMap<String, List<String>>();
    private String START = "A";
    private int[] visit;

    private void initGraph(String[][] tickets) {
        for (String[] ticket : tickets) {
            if (graph.containsKey(ticket[0])) {
                graph.get(ticket[0]).add(ticket[1]);
            } else {
                List<String> arrivals = new ArrayList<String>();
                arrivals.add(ticket[1]);
                graph.put(ticket[0], arrivals);
            }
        }
        sortArrials();
        visit = new int[graph.size()];
    }

    private void sortArrials() {
        for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
            Collections.sort(entry.getValue());
        }
    }

    private List<String> getItinerary() {
        List<String> itinerary = new ArrayList<String>();
        if (!graph.containsKey(START)) {
            return itinerary;
        }
        Stack<String> path = new Stack<String>();
        path.push(START);
        String from = START;
        while (graph.size() > 0) {
            if (!graph.containsKey(from)) {
                while (!graph.containsKey(path.peek())) {
                    List<String> tmp = new ArrayList<String>();
                    tmp.add(from);
                    path.pop();
                    graph.put(path.peek(), tmp);
                }
                graph.get(path.peek()).add(from);
                from = path.peek();
            } else {
                String to = graph.get(from).get(0);
                graph.get(from).remove(0);
                if (graph.get(from).size() == 0) {
                    graph.remove(from);
                }
                path.push(to);
                from = to;
            }
        }

        for (int i = 0; i < path.size(); i++) {
            itinerary.add(path.get(i));
        }
        return itinerary;

    }

    public List<String> findItinerary(String[][] tickets) {
        initGraph(tickets);
        return getItinerary();
    }
}
