// Last updated: 8/14/2026, 10:50:52 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        String[] arr = s.split(" ");

        if(pattern.length() != arr.length)
        {
            return false;
        }

        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            String temp = arr[i];
            if(map1.containsKey(ch))
            {
                if(!map1.get(ch).equals(temp)){
                return false;
                }
            }
            else{
                map1.put(ch,temp);
            }
            if(map2.containsKey(temp))
            {
                if(map2.get(temp)!=ch){
                return false;
                }
            }
            else{
                map2.put(temp,ch);
            }
        }
        return true;
    }
}