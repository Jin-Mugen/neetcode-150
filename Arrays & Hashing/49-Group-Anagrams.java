// https://leetcode.com/problems/group-anagrams/description/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(String str: strs) {
        int[] charArr = new int[26];

            for(char ch: str.toCharArray()){
                charArr[ch-'a']++;
            }

            String key = Arrays.toString(charArr);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(str);
        }

        return new ArrayList<>(mp.values());
    }
}

// *****************************************************************
// Sorting and map, Freq Arr and map
