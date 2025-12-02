class Solution {
    public int findMaxK(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i:nums){
            if(i<0){
               list.add(i);
            }
            else{
                list2.add(i);
            }
        }
         int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list2.size();j++){
                int n=Math.abs(list.get(i));
                if(n==list2.get(j)&&list2.get(j)>max){
                     max=list2.get(j);
                }
            }
        }
        if(max==-2147483648){
            return -1;
        }
        return max;
    }
}