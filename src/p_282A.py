import sys

N = int(input())
data = sys.stdin.read().split()

x = 0
for op in data:
    x += 1 if op[1] == '+' else -1

print(x)
