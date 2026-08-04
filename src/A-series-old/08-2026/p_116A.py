import sys


def solution(pairs: list[tuple]) -> int:
    maxDiff = netDiff = 0
    for x, y in pairs:
        netDiff += y - x
        maxDiff = max(maxDiff, netDiff)

    return maxDiff


def main() -> None:
    inputs = list(map(int, sys.stdin.read().split()))
    N = inputs[0]
    pairs = [(inputs[i], inputs[i+1]) for i in range(1, 2*N + 1, 2)]

    result = solution(pairs)
    print(result)


if __name__ == "__main__":
    main()
