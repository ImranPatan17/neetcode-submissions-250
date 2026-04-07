class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        String temp= strs[0];String res="";
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<Math.min(temp.length(),strs[i].length())){
            if(temp.charAt(j)!=strs[i].charAt(j)){
                break;
            }
            j++;
            }
            temp=temp.substring(0,j);
        }
        return temp;
    }
}