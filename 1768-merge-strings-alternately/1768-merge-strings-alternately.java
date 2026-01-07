class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int maxlength = Math.max(word1.length(), word2.length());
        int i = 0;
        while(i < maxlength){
            if(i<word1.length()){
                merged.append(word1.charAt(i));
            }
                
            if(i<word2.length()){
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();
    }
}