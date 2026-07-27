"""
Cost of bananas:
=> k + 2k + 3k + ... + nk for n bananas
=> k(1 + 2 + 3 + ... + n)
Cost of w bananas => k * w(w+1)//2
"""

import sys

userData = sys.stdin.readline().split()
k, n, w = int(userData[0]), int(userData[1]), int(userData[2])

borrow = k * w * (w + 1) // 2 - n
borrow = 0 if borrow <= 0 else borrow
print(borrow)
