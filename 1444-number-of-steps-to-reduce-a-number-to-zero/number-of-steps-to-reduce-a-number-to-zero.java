class Solution {
    public int numberOfSteps(int num) {
        return healper(num,0);
    }
    public int healper(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%2 == 0){
           return healper(n/2,count+1);
        }
        return healper(n-1,count+1);
    }
}