class Solution {
    public String reverseVowels(String s) {
        char[] arr={'a','e','i','o','u'};
        HashSet<Character> set= new HashSet();
        for (char c : arr) {
            set.add(c);
        }
        char[] out=new char[s.length()];
        int f=0;
        int b=s.length()-1;
        while(f<=b){
            if(set.contains(Character.toLowerCase(s.charAt(f))) && set.contains(Character.toLowerCase(s.charAt(b)))){
                out[f]=s.charAt(b);
                out[b]=s.charAt(f);
                f+=1;
                b-=1;
            }
            else if((set.contains(Character.toLowerCase(s.charAt(f))))){
                out[b]=s.charAt(b);
                b-=1;
            }
            else if((set.contains(Character.toLowerCase(s.charAt(b))))){
                out[f]=s.charAt(f);
                f+=1;
            }
            else{
                out[f]=s.charAt(f);
                out[b]=s.charAt(b);
                f+=1;
                b-=1;
            }
        }
        return new String(out);

   }
}