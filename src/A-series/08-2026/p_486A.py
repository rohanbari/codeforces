from math import ceil


def f(n: int) -> int:
    if n % 2 == 1:
        return -((n + 1) // 2)
    else:
        return n // 2


def main() -> None:
    N = int(input())
    res = f(N)
    print(res)


if __name__ == "__main__":
    main()
