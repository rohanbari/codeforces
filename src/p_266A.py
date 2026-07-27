import sys

userData = sys.stdin.read().split()

N = int(userData[0])
data = userData[1]

count = 0
for i in range(1, N):
    if data[i] == data[i - 1]:
        count += 1

print(count)
