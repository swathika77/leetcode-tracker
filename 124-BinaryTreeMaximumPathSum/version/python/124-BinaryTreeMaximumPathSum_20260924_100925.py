# Last updated: 24/09/2026, 10:09:25
1class Solution:
2    def findLadders(self, beginWord: str, endWord: str, wordList: List[str]) -> List[List[str]]:
3        wordList = set(wordList)  # converting the given list to set to perform optimized set reduction
4        result = []
5        layer = set()
6        layer.add(beginWord)  # maintaining each layer to do bfs for the next layer
7        # a dictionary to maintain the parent of each word, note in this bfs, one node can have multiple parent
8        # e.g.: we can arrive at 'cog' from 'dog' and 'log'
9        # this parent chaining will help us save some memory and create the required list later using build_path
10        parent = defaultdict(set)
11        while layer:
12            new_layer = set()
13            for word in layer:
14                for i in range(len(beginWord)):
15                    for c in "abcdefghijklmnopqrstuvwxyz":
16                        new = word[:i] + c + word[i + 1:]
17                        if new in wordList and new != word:
18                            parent[new].add(word)
19                            new_layer.add(new)
20            wordList -= new_layer
21            layer = new_layer
22
23        def build_path(last, lst):
24            if last == beginWord:
25                result.append(list(reversed(lst))) # since we build the path bottom up, so reversing
26                return
27            for word in parent[last]:
28                build_path(word, lst + [word])
29
30        build_path(endWord, [endWord])
31        return result