userInput = input()
distinctLetters = set(userInput)

if len(distinctLetters) % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")
