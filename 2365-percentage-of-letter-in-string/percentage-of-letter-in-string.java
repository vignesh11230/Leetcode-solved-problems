class Solution {
    public int percentageLetter(String s, char letter) {
        char arr[]=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:arr){
              map.put(i,map.getOrDefault(i,0)+1);

        }
        int n=map.getOrDefault(letter,0);
        return (n*100)/s.length();
    }
}