#magic-square of odd-dimension
n = int(input('Enter n:'))
# creating a structure of dim nxn
def magicSquare(n):
    magicSqr = []
    for i in range(n):
        l = []
        for j in range(n):
            l.append(0)
        magicSqr.append(l)
    i = 1
    p, q = int(n/2), n-1
    while (i <= n*n):
        if magicSqr[p][q] == 0:
            magicSqr[p][q] = i
        p = p-1
        q = q+1
        if p == -1 and q == n:
            p = 0
            q = n-2
        elif p == -1:
            p = n-1
        elif q == n:
            q = 0
        elif magicSqr[p][q] != 0:
            p = p+1
            q = q-2
        i = i+1
    # print(magicSqr)
    for i in range(n):
        for j in range(n):
            print(magicSqr[i][j], end=' ')
        print()

magicSquare(n)


#We can write a for-loop inside a []
magic = [0 for i in range(n)]  
print(magic)  
