def isDistinct(num: int) -> bool:
    digits = set()
    while num > 0:
        if num % 10 in digits:
            return False

        digits.add(num % 10)
        num //= 10

    return True


def solution(y: int) -> int:
    y += 1
    while not isDistinct(y):
        y += 1

    return y


def main() -> None:
    y = int(input())
    print(solution(y))


if __name__ == "__main__":
    main()
