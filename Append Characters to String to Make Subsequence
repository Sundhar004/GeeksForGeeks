class Solution {
    public int appendCharacters(String s, String t) {
        int slen = s.length(), tlen = t.length();
        int sInd = 0, tInd = 0;
        while(sInd<slen && tInd<tlen)
        {
            if(s.charAt(sInd) == t.charAt(tInd))
            {
                tInd++;
            }
            sInd++;
        }
        return tlen - tInd; 
    }
}
