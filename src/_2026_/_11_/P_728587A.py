def main() -> None:
    input()  # skipping
    nums = list(map(int, input().split()))

    solve(nums)


def solve(nums: list[int]):
    sum = 0
    for num in nums:
        sum += num
        print(sum, end=" ")


if __name__ == "__main__":
    main()
