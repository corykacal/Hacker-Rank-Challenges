#!/bin/python
from __future__ import print_function
import os
import sys

class _TrieNode(object):

        def __init__(self,char):
            global children
            self.children = {}
            self.size = 0

        def contains(self, char):
            return self.children.get(char)!=None

        def add(self, char):
            newChild = self.__class__(char)
            self.children[char] = newChild

        def get(self, char):
            if(not self.contains(char)):
                return None
            return self.children[char]

class Trie(object):

    def __init__(self):
        self.root = _TrieNode('')
                
    def add(self, word):
        word = word.upper()
        node = self.root
        while(len(word)!=0):
            node.size+=1
            char = word[0]
            if(not node.contains(char)):
                node.add(char)
            node = node.get(char)
            word = word[1:len(word)]
        node.size+=1

    def wordCount(self, prefix):
        prefix = prefix.upper()
        node = self.root
        while node!=None:
            if(len(prefix)==0):
                return node.size
            char = prefix[0]
            if(not node.contains(char)):
                return 0
            node = node.get(char)
            prefix = prefix[1:len(prefix)]
        return 0

#
# Complete the contacts function below.
#
def contacts(queries):
    trie = Trie()
    for command, word in queries:
        if(command=="add"):
            trie.add(word)
        if(command=="find"):
            print (trie.wordCount(word))
            

if __name__ == '__main__':

    queries_rows = int(raw_input())

    queries = []

    for _ in xrange(queries_rows):
        queries.append(raw_input().rstrip().split())

    result = contacts(queries)



