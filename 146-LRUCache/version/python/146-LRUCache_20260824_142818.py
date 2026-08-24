# Last updated: 24/08/2026, 14:28:18
1from collections import OrderedDict
2
3class LRUCache:
4
5    def __init__(self, capacity: int):
6        self.capacity = capacity
7        self.storage = OrderedDict()
8        
9    def get(self, key: int) -> int:
10        if key not in self.storage:
11            return -1
12        self.storage.move_to_end(key)
13        return self.storage[key]
14
15    def put(self, key: int, value: int) -> None:
16        if key in self.storage:
17            self.storage[key] = value
18            self.storage.move_to_end(key)
19        else:
20            if len(self.storage) >= self.capacity:
21                self.storage.popitem(last=False)
22            self.storage[key] = value
23
24# Your LRUCache object will be instantiated and called as such:
25# obj = LRUCache(capacity)
26# param_1 = obj.get(key)
27# obj.put(key,value)