package Strings;

public class compareTo {
    public static void main(String[] args) {
        String s = "ananya bhanjana";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b)); //'a' - 'd'
        // difference between the ascii values of different letter in string

        String a1 = "anc";
        String b1 = "dbc";
        System.out.println(a1.compareTo(b1)); // 'a' - 'd'
        // sabse pehle jo different milega returns the difference, fir aage check nahi krta even if aage different hai string

        String a2 = "anc";
        String b2 = "abc";
        System.out.println(a2.compareTo(b2)); // 'n' - 'b'

        String a3 = "acg";
        String b3 = "ac";
        System.out.println(a3.compareTo(b3)); 
        // if first part is same but length of first string is more then returns the length of extra letters with positive sign i.i 1 (only extra 'g')

        String a4 = "abcghnnnj";
        String b4 = "abc";
        System.out.println(a4.compareTo(b4));
        // length of a>b hence, ghnnnj ka length = 6 is returned

        String a5 = "abc";
        String b5 = "abcjjj";
        System.out.println(a5.compareTo(b5)); 
        // if length of second string is more then extra length string is returned but with a negative sign -> -3

        String a6 = "anchujk";
        String b6 = "abc";
        System.out.println(a6.compareTo(b6)); 
        // agar shuru me hi different char aajata hia toh seedha difference return ho jaayge and vo aage check hi nahi karega if length is same or not so here 'n' - 'b' will be returned instead of 3 (extra length)

        String nn = "Anc";
        String mm = "abc";
        System.out.println(nn.compareTo(mm)); // 'A' - 'a' = -32
    }
}
