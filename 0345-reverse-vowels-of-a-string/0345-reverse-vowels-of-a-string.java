class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int pointer1 = 0;
        int pointer2 = chars.length - 1;

        while(pointer1 < pointer2){
            while(pointer1 < pointer2 && !isVowel(chars[pointer1])){
                pointer1++;
            }
            while(pointer1 < pointer2 && !isVowel(chars[pointer2])){
                pointer2--;
            }
             if(pointer1 < pointer2){
                char temp = chars[pointer1];
                chars[pointer1] = chars[pointer2];
                chars[pointer2] = temp;
                pointer1++;
                pointer2--;
             }
        }
        return new String(chars);
    }

    public boolean isVowel(char c){
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
        (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }
}