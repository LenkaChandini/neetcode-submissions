class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> seen = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sortval = new String(ch);
            if(!seen.containsKey(sortval)) {
                seen.put(sortval,new ArrayList<>());
            }
            seen.get(sortval).add(str);

        }
        return new ArrayList<>(seen.values());
    }
}