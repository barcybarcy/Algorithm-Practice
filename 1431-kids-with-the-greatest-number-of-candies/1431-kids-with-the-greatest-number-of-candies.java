class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandiesNum = 0;
        for(int num : candies){
            MaxCandiesNum = Math.max(MaxCandiesNum, num);
        }
        List<Boolean> result = new ArrayList<>();
        for(int num : candies){
            if((num+extraCandies) >= MaxCandiesNum){
                result.add(true);
            } else{
                result.add(false);
            }
        }
        return result;
    }
}