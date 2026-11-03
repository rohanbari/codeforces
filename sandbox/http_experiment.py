import json
from urllib.request import Request, urlopen


def main() -> None:
    URL = "https://httpbin.org/post"
    PAYLOAD = {
        "name": "Rohan", "role": "Software Engineer"
    }

    data = json.dumps(PAYLOAD).encode("utf-8")

    request = Request(URL, method="POST", data=data, headers={
        "User-Agent": "Backend-Learning",
        "Content-Type": "application/json",
        "Accept": "application/json",
    })

    with urlopen(request, timeout=10) as response:
        print("Status:", response.status)
        print("Headers:", response.headers)
        print("Body:", response.read().decode("utf-8"))


if __name__ == "__main__":
    main()
