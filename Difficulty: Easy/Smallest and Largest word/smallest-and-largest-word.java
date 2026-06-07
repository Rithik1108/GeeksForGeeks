class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
        int minl = Integer.MAX_VALUE;
        int maxl = Integer.MIN_VALUE;
        String smallest = "";
        String largest = "";
        for(String word : s.trim().split("\\s+")){
            if(word.length()<minl){
                smallest = word;
                minl = word.length();
            }
            if(word.length()>=maxl){
                largest = word;
                maxl = word.length();
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(smallest);
        list.add(largest);
        return list;
    }
}