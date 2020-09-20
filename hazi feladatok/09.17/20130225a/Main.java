/*
Sztring tisztítása

Hacker Hugó egy olyan szkripten dolgozik, mely proxy szerverek listáját tárolja egy lokális SQLite
adatbázisban. A szkript a proxy-k címét több publikus oldalról gyűjti össze
(pl. http://www.ip-adress.com/proxy_list/). A szkript a legtöbb URL-t helyesen szedi ki, viszont
egyes címekben whitespace karakterek is szerepelnek, pl.: "192.20.246.138:\n 6666",
"206.130.99.82:\n8080", stb. Segítsünk Hugónak egy olyan függvény megírásában, mely paraméterként
kap egy sztringet, visszatérési értéke pedig a whitespace-ektől megtisztított sztring legyen.
*/
public class Main {
    public static String getStringWithoutWhiteSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isWhitespace(s.charAt(i)) || Character.isSpaceChar(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String u1 = "192.20.246.138:\n 6666";
        String u2 = "206.130.99.82:\n8080";
        System.out.printf("'%s' --> '%s'\n", u1, getStringWithoutWhiteSpaces(u1));
        System.out.println();
        System.out.printf("'%s' --> '%s'\n", u2, getStringWithoutWhiteSpaces(u2));
    }
}
