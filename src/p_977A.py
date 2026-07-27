# import sys

# userData = sys.stdin.readline().split()
# n, k = int(userData[0]), int(userData[1])

# while k > 0:
#     if n % 10 != 0:
#         remainder = n % 10
#         n -= remainder
#         k -= remainder
#     else:
#         n //= 10
#         k -= 1

# print(n)

import sys

n, k = map(int, sys.stdin.readline().split())

for _ in range(k):
    if n % 10 != 0:
        n -= 1
    else:
        n //= 10

print(n)
