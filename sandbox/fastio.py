import sys


def solve():
    # Fast reading of all inputs into memory at once
    input_data = []
    try:
        input_data = sys.stdin.read().split()
        if not input_data:
            return
    except KeyboardInterrupt as e:
        pass

    # Pointer to track current index in input array
    ptr = 0

    # Example parsing: Reading number of test cases t
    t = int(input_data[ptr])
    ptr += 1

    out = []
    for _ in range(t):
        n = int(input_data[ptr])
        ptr += 1

        # Example array reading
        arr = list(map(int, input_data[ptr: ptr + n]))
        ptr += n

        # Add result to output buffer
        out.append(str(arr))

    # Single fast write operation
    sys.stdout.write("\n".join(out) + "\n")


if __name__ == "__main__":
    solve()
