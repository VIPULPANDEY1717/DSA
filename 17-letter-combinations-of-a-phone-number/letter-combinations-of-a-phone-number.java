class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return pad2("",digits);
        
    }
    public ArrayList<String> pad2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        int digit = up.charAt(0) - '0';
        int start = (digit - 2)*3 ;
        if(digit>7){
            start++;
        }
        int end = start + 3;
        ArrayList<String> ans = new ArrayList<>();
        if(digit == 7 || digit == 9){
            end++;
        }
        for (int i =start; i <end ; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad2(p+ch,up.substring(1)));


        }
        return ans;
    }

}