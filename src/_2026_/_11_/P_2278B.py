def main() -> None:
    t = int(input())
    for _ in range(t):
        x, y, z = list(map(int, input().split()))
        res = solve(x, y, z)
        print(res)


def solve(x: int, y: int, z: int) -> str:
    ans = ""

    if x >= y and x >= z:
        # Played rock
        ans = "P" * (x + y + z)
    elif y >= x and y >= z:
        # Played scissors
        ans = "R" * (x + y + z)
    else:
        ans = "S" * (x + y + z)

    return ans


if __name__ == "__main__":
    main()
