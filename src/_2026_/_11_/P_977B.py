def main() -> None:
    n = int(input())
    seq = input()

    print(solve(n, seq))


def solve(n: int, seq: str) -> str:
    freq = {}

    for i in range(n - 1):
        two_gram = seq[i:i + 2]
        freq[two_gram] = freq.get(two_gram, 0) + 1

    return max(freq, key=lambda x: freq[x])


if __name__ == "__main__":
    main()
