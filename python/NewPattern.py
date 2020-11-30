def pattern(a):
    count = 1
    n = len(a)
    j = 0
    for i in range(n):
        k = 0
        while j >= 0:
            a[k][j] = count
            count = count+1
            j = j-1
            k = k+1
        j = i+1
    j = n-1
    i = 1
    for r in range(n-1):
        k, j = i, n-1
        while j >= i:
            a[k][j] = count
            count = count + 1
            j = j-1
            k = k+1
        i = i+1
    
n = int(input(''))
a = []
for r in range(n):
    l = []
    for j in range(n):
        l.append(0)
    a.append(l)
pattern(a)
for i in range(n):
    for j in range(n):
        print(a[i][j], end=' ')
    print()