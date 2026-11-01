import sys


def main() -> None:
    std_input = input()
    result = ("0000000" in std_input) or ("1111111" in std_input)
    print("YES" if result else "NO")


if __name__ == "__main__":
    main()
