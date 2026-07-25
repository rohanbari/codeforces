import sys

N = int(input())
inputData = sys.stdin.read().split()

for data in inputData:
    strLen = len(data)
    if strLen > 10:
        result = data[0] + str(strLen - 2) + data[-1]
        print(result)
        continue

    print(data)
