// Last updated: 9/2/2026, 11:22:00 AM
1class Solution {
2    List<Integer> circuit;
3    public int[][] validArrangement(int[][] pairs) {
4        Map<Integer, List<Integer>> graph=new HashMap();
5        Map<Integer, Integer> node=new HashMap();
6
7        for(int[] pair:pairs){
8            if(!graph.containsKey(pair[0])){
9                graph.put(pair[0], new ArrayList());
10            }
11            graph.get(pair[0]).add(pair[1]);    //Preparing graph
12            node.put(pair[0], node.getOrDefault(pair[0],0)-1); //Outgoing
13            node.put(pair[1], node.getOrDefault(pair[1],0)+1); //Incoming
14        }
15
16
17        //selecting the starting node
18        int startNode=pairs[0][0];
19        for(Map.Entry<Integer, Integer> enty:node.entrySet()){
20            if(enty.getValue()==-1){
21                startNode=enty.getKey();
22                break;
23            }
24        }
25
26        circuit=new ArrayList();
27        dfs(graph, startNode);
28        Collections.reverse(circuit);
29        
30       
31        int[][] result=new int[pairs.length][2];
32        for(int i=1; i<circuit.size(); i++){
33            result[i-1][0]=circuit.get(i-1);
34            result[i-1][1]=circuit.get(i);
35        }
36
37        return result;
38    }
39
40    void dfs(Map<Integer, List<Integer>> graph, int u){
41        while(graph.containsKey(u) && !graph.get(u).isEmpty()){
42            int v=graph.get(u).remove(0);
43            dfs(graph, v);
44        }
45        circuit.add(u);
46    }
47
48
49}