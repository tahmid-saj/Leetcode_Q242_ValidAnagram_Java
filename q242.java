class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> letters = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++) {
            letters.remove(Character.valueOf(t.charAt(j)));
        }

        return letters.isEmpty();
    }
}
