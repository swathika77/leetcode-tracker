// Last updated: 28/09/2026, 09:06:58
1public class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList[] graph = new ArrayList[numCourses];
4        int[] degree = new int[numCourses];
5        Queue queue = new LinkedList();
6        int count=0;
7        
8        for(int i=0;i<numCourses;i++)
9            graph[i] = new ArrayList();
10            
11        for(int i=0; i<prerequisites.length;i++){
12            degree[prerequisites[i][1]]++;
13            graph[prerequisites[i][0]].add(prerequisites[i][1]);
14        }
15        for(int i=0; i<degree.length;i++){
16            if(degree[i] == 0){
17                queue.add(i);
18                count++;
19            }
20        }
21        
22        while(queue.size() != 0){
23            int course = (int)queue.poll();
24            for(int i=0; i<graph[course].size();i++){
25                int pointer = (int)graph[course].get(i);
26                degree[pointer]--;
27                if(degree[pointer] == 0){
28                    queue.add(pointer);
29                    count++;
30                }
31            }
32        }
33        if(count == numCourses)
34            return true;
35        else    
36            return false;
37    }
38}