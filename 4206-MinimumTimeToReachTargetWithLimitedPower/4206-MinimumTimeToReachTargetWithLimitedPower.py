# Last updated: 09/07/2026, 10:06:38
class Solution:
    def minTimeMaxPower(self, n: int, edges: List[List[int]], power: int, cost: List[int], source: int, target: int) -> List[int]:
        graph = [[] for _  in range(n)]
        for u,v,t in edges:
            graph[u].append((v,t))
        INF = float('inf')
        dist = [[INF] * (power+ 1) for _ in range(n)]
        pq = [(0, source,power)]
        dist[source][power] = 0
        while pq:
            time, u , p = heapq.heappop(pq)
            if time != dist[u][p]:
                continue
            for v,w in graph[u]:
                if p < cost[u]:
                    continue
                np = p - cost[u]
                nt = time + w
                if nt < dist[v][np]:
                    dist[v][np] = nt 
                    heapq.heappush(pq, (nt,v,np))
        best_time = INF
        best_power = -1
        for p in range(power + 1):
            if dist[target][p] < best_time:
                best_time = dist[target][p]
                best_power = p
            elif dist[target][p] == best_time:
                best_power = max(best_power, p)
        if best_time == INF:
            return[-1,-1]
        return [best_time, best_power]