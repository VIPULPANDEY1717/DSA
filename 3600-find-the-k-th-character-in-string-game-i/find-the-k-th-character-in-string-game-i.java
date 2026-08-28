class Solution {
    public char kthCharacter(int k) {
        return solve(k,'a');
        
    }
    public char solve(int k, char ch){
        if(k==1){
            return ch;
        }
        int n = 1;
        while(n*2 < k){
            n*=2;
        }
        if(k<= n){
            return solve(k,ch);
        }else{
           return solve(k-n,(char)(ch+1));
        }

    }
}