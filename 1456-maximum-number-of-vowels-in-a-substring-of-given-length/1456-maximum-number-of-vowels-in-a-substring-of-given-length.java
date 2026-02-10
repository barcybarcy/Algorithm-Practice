class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }
        int maxVowel = vowelCount;
        for(int i = k; i < s.length(); i++){
            if(maxVowel == k){
                return k;
            }
            if(isVowel(s.charAt(i-k))){
                vowelCount--;
            }
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
            maxVowel = Math.max(vowelCount, maxVowel);
        }
        return maxVowel;
    }

    public boolean isVowel(char c){
        return (c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u');
    }
}