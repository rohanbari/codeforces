import sys

str1, str2 = input().lower(), input().lower()

for i in range(len(str1)):
    if str1[i] > str2[i]:
        print("1")
        sys.exit(0)
    elif str1[i] < str2[i]:
        print("-1")
        sys.exit(0)

print("0")
