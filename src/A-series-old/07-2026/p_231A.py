import sys


def solve(n: int) -> int:
    count = 0
    while n > 0:
        tup = sys.stdin.readline().split()
        cnt = tup.count('1')
        count += 1 if cnt >= 2 else 0

        n -= 1

    return count


N = int(input())
print(solve(N))
