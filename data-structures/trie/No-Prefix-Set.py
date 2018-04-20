#!/bin/python
from __future__ import print_function
import os
import sys

class _TrieNode(object):

        def __init__(self,char):
            global children
            self.children = {}
            self.size = 0
            self.isWord = False

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
            char = word[0]
            if(not node.contains(char)):
                node.add(char)
            node = node.get(char)
            word = word[1:len(word)]
            #if current node in addition is already a word
            if(node.isWord):
                return "BAD SET"
        node.isWord = True;
        #if current node at end of word is prefix of bigger word
        if(len(node.children)!=0):
            return "BAD SET"
        return "GOOD SET"
            

if __name__ == '__main__':

    num = int(raw_input())

    trie = Trie()
    badset = False
    for _ in range(num):
        word = raw_input()
        result = trie.add(word)
        if(result=="BAD SET"):
            print (result)
            print (word)
            badset = True
            break
    if(not badset):
        print ('GOOD SET')
    


