import math
max = int(1e6)
count = [0]*(max+1)
prime = [0]*(max+1)
def sieve():
    prime[0], prime[1] = 1, 1
    for i in range(2, int(math.sqrt(max+1))+1):
        if prime[i] == 0:
            for p in range(i*i, max+1):
                prime[p] = 1
    for i in range(1, max+1):
        if prime[i] == 0:
            count[i] = count[i-1] + 1
        else:
            count[i] = count[i-1]

if __name__ == "__main__":
    sieve()
    t = int(input())
    while t > 0:
        s = list(map(int, input().split()))
        x, y = s[0], s[1]
        if count[x] <= y:
            print("Chef")
        else:
            print("Divyam")
        t -= 1