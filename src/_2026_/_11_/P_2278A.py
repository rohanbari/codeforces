def main() -> None:
    t = int(input())

    for _ in range(t):
        _, _ = input().split()
        p = input()
        q = input()

        print("YES" if solve(p, q) else "NO")


def solve(p: str, q: str) -> bool:
    counter = [0] * 26
    a = ord('a')

    for ch in p:
        counter[ord(ch) - a] += 1

    for ch in q:
        counter[ord(ch) - a] -= 1

    counter[ord('s') - a] -= 1
    counter[ord('i') - a] -= 1
    counter[ord('x') - a] -= 1

    return all(x == 0 for x in counter)


if __name__ == "__main__":
    main()
