class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while(read < chars.length){
            int count = 0;
            char currentchar = chars[read];
            while(read < chars.length && chars[read] == currentchar){
                count++;
                read++;
            }
            chars[write] = currentchar;
            write++;
            if(count > 1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }

        return write;
    }
}