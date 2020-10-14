/*
rANdOm CasE

Írjon egy programot, ami interaktív módon bekér egy sztringet, majd kiírja a sztringet "random case" módon. "Random
case" mód alatt azt értjük, hogy random módon döntsük el, hogy az egyes betűk kis- vagy nagybetűsek legyenek-e.

Tipp: a Math.random() egy valós értéket ad vissza a [0.0, 1.0[ intervallumból. Ha ez az érték < 0.5, akkor lehet az
adott betű kisbetűs, ellenkező esetben pedig nagybetűs.

Példa:

$ java Main
Text: hello world
HeLlO wORlD

$ java Main
Text: hello world
hElLO WorLD

Többszöri futtatás esetén természetesen más-más kimenet várható.

Megszorítások:

    Legyen egy Main osztály (ez lesz a vezérlő).
    A terminálról való beolvasást egy PyUtils.input() nevű metódussal oldjuk meg (ez már volt korábban, elő lehet
    keresni).
    A random case szöveget egy StringUtils.randomCase() metódussal valósítsuk meg. Bemenet: a felh. által megadott
    sztring. Kimenet: a random case szöveg.
*/
public class Main {

    public static void main(String[] args) {
        String s = PyUtils.input("Text: ");
        System.out.println(StringUtils.randomCase(s));
    }
}
