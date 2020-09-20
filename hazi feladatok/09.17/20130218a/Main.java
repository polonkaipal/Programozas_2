/*
Csodálatos elme

A következő üzenetet e-mail-ben kaptam. Tegyük olvashatóvá a szöveget:

3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754
M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.
3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D
3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D
4U70M471KU54N 3L 7UDJ4 0LV45N1.
4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.
L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.
H4 7375Z377, 05ZD M3G M450KK4L 15!
*/
public class Main {
    static String TEXT =
    "3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754\n"+
    "M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.\n"+
    "3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D\n"+
    "3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D\n"+
    "4U70M471KU54N 3L 7UDJ4 0LV45N1.\n"+
    "4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.\n"+
    "L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.\n"+
    "H4 7375Z377, 05ZD M3G M450KK4L 15!\n";

    public static String translate(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '3') {
                sb.append('E');
                continue;
            }
            if (text.charAt(i) == '4') {
                sb.append('A');
                continue;
            }
            if (text.charAt(i) == '7') {
                sb.append('T');
                continue;
            }
            if (text.charAt(i) == '5') {
                sb.append('S');
                continue;
            }
            if (text.charAt(i) == '1') {
                sb.append('I');
                continue;
            }
            if (text.charAt(i) == '0') {
                sb.append('O');
                continue;
            }
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.printf(translate(TEXT));
    }
}
