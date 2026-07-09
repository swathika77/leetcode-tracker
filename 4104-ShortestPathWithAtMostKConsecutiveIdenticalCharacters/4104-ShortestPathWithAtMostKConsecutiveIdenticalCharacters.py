# Last updated: 09/07/2026, 10:06:40
from heapq import heappush, heappop
from collections import defaultdict
class Solution(object):
    def shortestPath(self, n, edges, labels, k):
        graph = [[] for _ in range(n)]
        for u,v, w in edges:
            graph[u].append((v,w))
        pq = [(0 , 0, labels[0], 1 )]
        dist = {}
        dist[(0,1)] = 0
        while pq:
            cost, node, ch, streak= heappop(pq)
            if node == n-1:
                     return cost
            if cost > dist.get((node, streak), float('inf')): 
                     continue
            for nxt, w in graph[node]:
                    if labels[nxt] == ch:
                         ns = streak + 1
                    else:
                        ns = 1
                    if ns > k:
                        continue
                    ncost = cost + w
                    state = (nxt, ns)
                    if ncost < dist.get(state, float('inf')):
                        dist[state] = ncost
                        heappush(pq, (ncost, nxt, labels[nxt], ns))
        return -1    
        