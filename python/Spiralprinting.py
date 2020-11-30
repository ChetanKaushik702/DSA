def spiral(m, n, a):
    k = 0  # row-index
    l = 0  # column-index

    while k < m and l < n:
        # print the first row
        for i in range(l, n):
            print(a[k][i], end=' ') # row is fixed and column is changing
        k = k + 1 

        # print the last column contents
        for i in range(k, m):
            print(a[i][n-1], end=' ') # column is fixed and row is changing
        n = n - 1

        if k < m:
            # print the last row in reverse order
            for i in range(n-1, l-1, -1):
                print(a[m-1][i], end=' ')
            m = m - 1
        
        if l < n:
            # print the first column in reverse order
            for i in range(m-1, k-1, -1):
                print(a[i][l], end=' ')
            l = l + 1

a = []
m = int(input('Enter number of rows: '))
n = int(input('Enter number of columns: '))

count = 1
for i in range(m):
    l = []
    for j in range(n):
        l.append(count)
        count = count + 1
    a.append(l)
spiral(m, n, a)