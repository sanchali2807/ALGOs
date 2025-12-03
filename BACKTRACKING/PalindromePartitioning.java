class Solution {
        List<List<String>> res = new ArrayList<>();
        public boolean isPalindrome(String s,int st , int e){
            while(st<e){
            if(s.charAt(st) != s.charAt(e)){
                return false;
            }
            st++;
            e--;
            }
            return true;
        }
        public void backtrack(int st , String s , List<String>list){
            if(st==s.length()){
                res.add(new ArrayList<>(list));
                return;
            }
            for(int i=st;i<s.length();i++){
                if(isPalindrome(s,st,i)){
                    list.add(s.substring(st,i+1));
                    backtrack(i+1,s,list);
                    list.remove(list.size()-1);
                }
            }
        }
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        backtrack(0,s,list);
        return res;
    }
}
