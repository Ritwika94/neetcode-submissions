class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        };
        Queue<String> q =new LinkedList();
        Set<String> set = new HashSet<>(wordList);
        q.add(beginWord);
        int len =0;
        while(!q.isEmpty()){
            len++;
            int size =q.size();
            for(int i = 0; i< size;i++){
                String w =q.poll();
                if(w.equals(endWord)){
                    return len;
                }
                for(int j =0;j< w.length();j++){
                    for(char c ='a';c<='z';c++){
                        if(w.charAt(j)==c)
                        continue;
                        String str =w.substring(0,j)+c+w.substring(j+1);
                        if(set.contains(str)){
                            q.add(str);
                            set.remove(str);
                        }
                    }
                }
            }
        }

        return 0;
    }
}
