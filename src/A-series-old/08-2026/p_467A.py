import sys


def main() -> None:
    N = int(input())
    count = 0

    for i in range(N):
        x, y = map(int, sys.stdin.readline().split())
        if y - x >= 2:
            count += 1

    print(count)


if __name__ == "__main__":
    main()
