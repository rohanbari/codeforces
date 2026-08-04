import sys


def solution(inputs: list[int]) -> str:
    return "HARD" if 1 in inputs[1:] else "EASY"


def main() -> None:
    inputs = list(map(int, sys.stdin.read().split()))
    result = solution(inputs)
    print(result)


if __name__ == "__main__":
    main()
