/*
PyUtils.input()

Implementáljuk az input() nevű statikus metódust, mellyel a felhasználótól interaktív módon tudunk
bekérni egy sort. Használata:
String name = PyUtils.input("Neved: ");
System.out.printf("Hello %s!\n", name);

Futtatás közben:

$ java Main
Neved: Lac
Hello Lac!

Az input() argumentuma a prompt, amit megjelenítünk a felhasználónak.

Írjunk egy olyan verziót is, aminek nincs egyetlen argumentuma sem, s így semmiféle promptot sem
jelenít meg. (Interaktív módban ennek a használatát kerüljük! A felhasználót MINDIG tájékoztassuk
arról, hogy éppen mit várunk tőle!)
*/
public class Main {
    public static void main(String[] args) {
        String name = PyUtils.input("Neved: ");
        System.out.printf("Hello %s!\n", name);

        String name2 = PyUtils.input();
        System.out.printf("Hello %s!\n", name2);
    }
}
