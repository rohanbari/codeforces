import sys

n, k = int(input()), int(input())
data = list(map(int, sys.stdin.read().split()))

advance = sum(1 for x in data if x >= k)
print(advance)
