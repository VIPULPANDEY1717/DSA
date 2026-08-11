class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();
        answer(s,current,ans,0);
        return ans;

    }
    void answer(String s,List<String> current,List<List<String>> ans,int index){
        if(index == s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i =index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                current.add(s.substring(index,i+1));
                answer(s,current,ans,i+1);
                current.remove(current.size()-1);
            }
        }
    }

    boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}