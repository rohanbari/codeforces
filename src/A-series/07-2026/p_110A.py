N = int(input())
count = 0

while N > 0:
    currNum = N % 10
    if currNum == 4 or currNum == 7:
        count += 1

    N //= 10

if count == 4 or count == 7:
    print("YES")
else:
    print("NO")
