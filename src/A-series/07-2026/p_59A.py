import sys

userInput = sys.stdin.readline()

N = len(userInput)
capitalCount = sum(1 for char in userInput if 'A' <= char <= 'Z')
smallCount = N - capitalCount - 1

print(userInput.lower() if smallCount >= capitalCount else userInput.upper())
