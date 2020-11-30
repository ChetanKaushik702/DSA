MAX_SIZE = 4000001
isprime = [0]*MAX_SIZE
SPF = [0]*MAX_SIZE

def manipSieve(n):
    prime = []
    for i in range(2, MAX_SIZE):
        if n > 0:
            isprime[0], isprime[1] = 1, 1
            if isprime[i] == 0:
                prime.append(i)
                n -= 1
                SPF[i] = i
            for j in range(len(prime)):
                if i*prime[j] < MAX_SIZE and prime[j] <= SPF[i]:
                    isprime[i*prime[j]] = 1
                    SPF[i*prime[j]] = prime[j]
        else:
            break
    return prime
if __name__ == "__main__":
    t = int(input(''))
    while t > 0:
        n = int(input(''))
        b = []*n
        s = input('').split(' ')
        s = list(map(int, s))
        for i in range(n):
            b.append(s[i])
        prime = manipSieve(n)
        for i in range(n):
            if b[i] != i+1:
                prime[i] = prime[b[i]-1]
        for i in prime:
            print(i, end=' ')
        print()
        t -= 1