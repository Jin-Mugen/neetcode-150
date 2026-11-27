// https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int num: nums) {
            if(st.contains(num)) return true;
            st.add(num);
        }
        return false;
    }
}

// ***************************************
// Solutions - Brute force, Sorting, HashSet, HashSet length
