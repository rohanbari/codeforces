N = int(input())

anton = input().count('A')
danik = N - anton

if anton > danik:
    print("Anton")
elif anton < danik:
    print("Danik")
else:
    print("Friendship")
