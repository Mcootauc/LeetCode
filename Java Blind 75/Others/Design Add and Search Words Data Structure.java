class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;
    public TrieNode () {}
}

class WordDictionary {
    TrieNode trie;

    public WordDictionary() {
        trie = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode currNode = trie;
        for (char ch : word.toCharArray()) {
            //checks if we already added the char we are on
            if (!currNode.children.containsKey(ch)) {
                currNode.children.put(ch, new TrieNode());
            }
            //make next node the child that we just added
            currNode = currNode.children.get(ch);
        }
        //at the end of the word
        currNode.isWord = true;
    }
    
    public boolean search(String word) {
        return searchInTrie(word, trie);
    }

    //made a helper to search in the trie
    public boolean searchInTrie(String word, TrieNode node) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            //check if the ch at index is the same as node
            if (!node.children.containsKey(ch)) {
                //then check if it's the char '.'
                if (ch == '.') {
                    for (char x : node.children.keySet()) {
                        //check the rest of the children with recursion
                        if (searchInTrie(word.substring(i + 1),  node.children.get(x))) {
                            return true;
                        }
                    }
                }
                //didn't find '.' or an answer
                return false;
            } else {
                //found matching char and now make node point to it's child
                node = node.children.get(ch);
            }
        }
        return node.isWord;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */