// Last updated: 09/07/2026, 10:09:00
class Solution {
    public String minWindow(String s, String t) {
        int match = 0;
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();

        for (char c : t.toCharArray())
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);

        int t_size = tmap.size();
        int l = 0, r = 0;
        int[] sb = new int[2];

        sb[0] = 0;
        sb[1] = -1;

        int min = s.length() + 1;

        while (r < s.length()) {
            char chr = s.charAt(r);

            if (tmap.containsKey(chr)) {
                smap.put(chr, smap.getOrDefault(chr, 0) + 1);

                if (tmap.get(chr).intValue()==(smap.get(chr).intValue()))
                    match++;
            }

            while (match == t_size) {
                if (r - l + 1 < min) {
                    sb[0] = l;
                    sb[1] = r;
                    min = r - l + 1;
                }
                char chl = s.charAt(l);
                if (smap.containsKey(chl)) {
                    smap.put(chl, smap.get(chl) - 1);
                    if (smap.get(chl) < tmap.get(chl))
                        match--;
                }
                l++;
            }

            r++;
        }

        return s.substring(sb[0], sb[1] + 1);
    }
}