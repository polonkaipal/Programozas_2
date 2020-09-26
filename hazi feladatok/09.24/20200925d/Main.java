/*
Texas Ranger

Először is tekintsük meg az alábbi videót, ami segít majd ráhangolódni a feladatra:
[https://youtu.be/Dmn4gtZWVzw]

Írjunk egy PyUtils osztályt, amiben legyen egy statikus range() nevű metódus. Ez a metódus egész számok listáját adja vissza egy megadott intervallumból. A metódust háromféleképpen is lehessen meghívni. Példák (bal oldalt a hívás, jobb oldalt a visszaadott lista tartalma):
PyUtils.range(0, 5)    ->    [0, 1, 2, 3, 4]
// alsó limit: 0; felső limit: 5; alsó limit benne van az eredményben, míg a felső limit nincs benne

PyUtils.range(3, 7)    ->    [3, 4, 5, 6]
PyUtils.range(3, 4)    ->    [3]
PyUtils.range(3, 3)    ->    []
// a 3-tól indulunk de a 3 már nem lesz benne, így ez egy üres lista lesz

PyUtils.range(10)    ->    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
// ez a felső limit lesz. Ekkor az alsó limit alapértelmezetten 0 lesz.

PyUtils.range(1)    ->    [0]
PyUtils.range(0)    ->    []
PyUtils.range(-4)    ->    []

PyUtils.range(4, 20, 2)    ->    [4, 6, 8, 10, 12, 14, 16, 18]
// indulunk 4-ről; a 20 már nincs benne; lépésköz: 2, azaz vesszük minden második elemet

PyUtils.range(4, 10, 1)    ->    [4, 5, 6, 7, 8, 9]
PyUtils.range(10, 4, 1)    ->    []

Egyelőre feltételezhetjük, hogy a lépésköz egy pozitív érték.

Tippek

    az ArrayList -et nem véletlenül vettük
    DRY (don't repeat yourself)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(PyUtils.toString(PyUtils.range(0, 5)));

        System.out.println(PyUtils.toString(PyUtils.range(3, 7)));
        System.out.println(PyUtils.toString(PyUtils.range(3, 4)));
        System.out.println(PyUtils.toString(PyUtils.range(3, 3)));

        System.out.println(PyUtils.toString(PyUtils.range(10)));

        System.out.println(PyUtils.toString(PyUtils.range(1)));
        System.out.println(PyUtils.toString(PyUtils.range(0)));
        System.out.println(PyUtils.toString(PyUtils.range(-4)));

        System.out.println(PyUtils.toString(PyUtils.range(4, 20, 2)));

        System.out.println(PyUtils.toString(PyUtils.range(4, 10, 1)));
        System.out.println(PyUtils.toString(PyUtils.range(10, 4, 1)));

    }
}
