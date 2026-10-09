# Last updated: 09/10/2026, 09:26:43
from collections import OrderedDict

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.storage = OrderedDict()
        
    def get(self, key: int) -> int:
        if key not in self.storage:
            return -1
        self.storage.move_to_end(key)
        return self.storage[key]

    def put(self, key: int, value: int) -> None:
        if key in self.storage:
            self.storage[key] = value
            self.storage.move_to_end(key)
        else:
            if len(self.storage) >= self.capacity:
                self.storage.popitem(last=False)
            self.storage[key] = value

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)