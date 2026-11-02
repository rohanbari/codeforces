from urllib.error import HTTPError, URLError
from urllib.request import Request, urlopen

url = "https://httpbin.org/get"

request = Request(
    url,
    method="GET",
    headers={
        "User-Agent": "Backend-Learning-Project",
        "Accept": "application/json"
    }
)

try:
    with urlopen(request, timeout=10) as response:
        print("Status:", response.status)
        print("Headers:", response.headers)
        print("Body:", response.read().decode("utf-8"))

except HTTPError as error:
    print("HTTP Error:", error.code)

except URLError as error:
    print("Connection Error:", error.reason)
