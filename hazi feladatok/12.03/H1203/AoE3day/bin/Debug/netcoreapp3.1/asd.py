#!/usr/bin/env python3


def main():
    li = []
    with open("input.txt") as f:
        for sor in f:
            li.append(sor.strip())

    print(fakszama(li, 1, 1)*fakszama(li, 3, 1)*fakszama(li, 5, 1)*fakszama(li, 7, 1)*fakszama(li, 1, 2))


def fakszama(li, right, down):
    sorHossza = len(li[0])
    elore = right
    kezdo = 0
    db = 0

    for i in range(1, len(li), down):
        kezdo += elore
        if li[i][kezdo % sorHossza] == "#":
            db += 1

    return db

##############################################################################


if __name__ == "__main__":
    main()
