import turtle
t = turtle.Turtle()
width = 5
height = 7
turtle.bgcolor('black')
t.setpos(0, 0)
dot_separator = 25
def circleSpiral(n, a):
    i, j = 0, 0 # i for rows and j for columns

    while(i < n and j < n):
        v = a[i][j]
        for r in range(i, n-1):
            a[r][j] = a[r+1][j]
        
        for r in range(i, n-1):
            a[n-1][r] = a[n-1][r+1]
        
        for r in range(n-1, i, -1):
            a[r][n-1] = a[r-1][n-1]
        
        for r in range(n-1, j+1, -1):
            a[i][r] = a[i][r-1]
        if j+1 < n:
            a[i][j+1] = v

        i = i + 1
        j = j + 1
        n = n - 1


def printArray(a):
    for i in range(len(a)):
        for j in range(len(a)):
            print(a[i][j], end= ' ')
        print()

def go(a):
    i, j = 0, 0 # i for rows and j for columns
    n = len(a)
    t.color('white')
    flag = 0
    while(i < n and j < n):
        if flag == 0:
            t.right(90)
            flag = 1

        v = a[i][j]
        for r in range(i, n-1):
            # a[r][j] = a[r+1][j]
            t.forward(dot_separator)
        t.right(90)
        for r in range(i, n-1):
            # a[n-1][r] = a[n-1][r+1]
            t.forward(dot_separator)
        t.right(90)
        for r in range(n-1, i, -1):
            # a[r][n-1] = a[r-1][n-1]
            t.forward(dot_separator)
        t.right(90)
        for r in range(n-1, j+1, -1):
            # a[i][r] = a[i][r-1]
            t.forward(dot_separator)
        if j+1 < n:
            a[i][j+1] = v
        t.right(90)
        i = i + 1
        j = j + 1
        n = n - 1

a = []
n = int(input(''))
count = 1
for i in range(n):
    l = []
    for j in range(n):
        l.append(count)
        count = count + 1
    a.append(l)
if __name__ == "__main__":
    printArray(a)
    circleSpiral(n, a)
    print()
    printArray(a)
    go(a)
    turtle.done()
    pass
