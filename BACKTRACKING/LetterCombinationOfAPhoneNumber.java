class Solution {
    String[] mp = {
    "", "", "abc", "def", "ghi",
    "jkl", "mno", "pqrs", "tuv", "wxyz"
};

    public void fun(String dig , StringBuilder ans , List<String> list , int idx){
        if(idx == dig.length()){
            list.add(ans.toString());
            return;
        }
        int d = dig.charAt(idx) - '0';
        String temp = mp[d];
        for(char c : temp.toCharArray()){
            ans.append(c);
            fun(dig,ans,list,idx+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        fun(digits,ans,list,0);
        return list;
    }   
}
