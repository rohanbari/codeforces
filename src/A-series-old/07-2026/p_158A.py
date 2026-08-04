import sys

data = list(map(int, sys.stdin.read().split()))

n, k = data[0], data[1]
array = data[2:]
threshold = array[k - 1]

advance = sum(1 for x in array if (x > k and x > 0))
print(advance)
