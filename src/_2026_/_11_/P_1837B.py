def main() -> None:
    inputs = list(map(int, input()))

    longest = 1
    curr = 1

    for i in range(1, len(inputs)):
        if inputs[i] == inputs[i - 1]:
            curr += 1
        else:
            curr = 1

        longest = max(longest, curr)

    print(longest + 1)
