class Solution {
    public String maximumOddBinaryNumber(String s) {
        char [] arr = s.toCharArray();
        int start = 0;
        int end = arr.length -1; 
        while(start < end){
            while(start < end && arr[start]=='1'){
                start++;
            }
            while(start < end && arr[end] == '0'){
                end--;
            }
            if(arr[start] == '0' && arr[end] == '1'){
                swap(arr,start,end);
                start++;
                end--;
            }
            for(int i = arr.length - 1 ; i>=0;i--){
                if(arr[i] == '1'){
                    swap(arr,i,arr.length-1);
                    break;
                }

            }

        }
        return new String(arr);
       
    }
    public void swap(char[] arr ,int first,int second){
            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}