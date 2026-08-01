import sys

inputs = list(map(int, sys.stdin.readline().split()))
n, h = inputs[0], inputs[1]

heights = list(map(int, sys.stdin.readline().split()))
bentDown = 0

for height in heights:
    bentDown += 2 if height > h else 1

print(bentDown)
