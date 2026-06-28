class Solution {
    public String sortVowels(String s) {
        String vowels ="aeiou";
        ArrayList<Character> va=new ArrayList<>();
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(Character.toLowerCase(s.charAt(i)))!=-1){
                va.add(s.charAt(i));
                index.add(i);
            }
        }
        Collections.sort(va);
        StringBuffer out=new StringBuffer(s);
        int j=0;
        for(int i=0;i<index.size();i++){
            out.setCharAt(index.get(i),va.get(i));
        }
        return out.toString();
    }
}