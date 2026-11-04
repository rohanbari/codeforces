def main() -> None:
    T = int(input())
    for _ in range(T):
        a, b, _ = list(map(int, input().split()))
        tools = list(map(int, input().split()))

        print(solve(a, b, tools))


def solve(a: int, b: int, tools: list[int]) -> int:
    seconds = b
    for tool in tools:
        seconds += min(tool, a - 1)

    return seconds


if __name__ == "__main__":
    main()
