
from sys import stdin


def main() -> None:
    n, q = map(int, stdin.readline().split())
    nums = list(map(int, stdin.readline().split()))

    queries = []
    for _ in range(q):
        l, r = map(int, stdin.readline().split())
        queries.append((l, r))

    for query in queries:
        print(solve(n, q, nums, query))


def solve(n: int, q: int, nums: list[int], query: tuple[int, int]) -> int:
    prefix = []
    prefix_sum = 0

    for num in nums:
        prefix_sum += num
        prefix.append(prefix_sum)

    first, second = query

    if first == 1:
        return prefix[second - 1]
    return prefix[second - 1] - prefix[first - 2]


if __name__ == "__main__":
    main()
