class TrieNode {
    public TrieNode[] children;
    public boolean isEnd;

    public TrieNode() {
        // alphabet consists of 26 letters
        children = new TrieNode[26];
    }

    public boolean containsKey(char ch) {
        return children[ch - 'a'] != null;
    }

    public void putChild(char ch, TrieNode node) {
        children[ch - 'a'] = node;
    }

    public TrieNode getChild(char ch) {
        return children[ch - 'a'];
    }
    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd() {
        isEnd = true;
    }
}

class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    // Time O(n):
    // n is the key length because it iterates through the length of the word once

    // Space O(n):
    // worst case senario is when the word doesn't share a prefix and you have to 
    // add n new nodes to the children

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (!node.containsKey(currChar)) {
                node.putChild(currChar, new TrieNode());
            }
            node = node.getChild(currChar);
        }
        node.setEnd();
    }
    
    // Time O(n):
    // n is the key length because it iterates through the length of the word once

    // Space O(1):
    // Doesn't matter how long the word is, it doesn't create more space
    
    public TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) { 
            char currChar = word.charAt(i);
            if (node.containsKey(currChar)) {
                node = node.getChild(currChar);
            } else {
                return null;
            }
        }
        return node;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */