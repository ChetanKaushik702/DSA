import turtle
from random import randint

turtle.bgcolor("black")
t = turtle.Turtle()
width = 5
height = 7
dot_separator = 25
t.setpos(-250, 250)
t.shape('turtle')
t.penup()
col = ["white" ,"#7fffd4" ,"#0000ff", "#8a2be2", "#f8f8ff", "#ffc125", "#ee1289", "#ff1493", "#b4eeb4", "#68228b", "#ffb90f", "#00ffff", "#66cd00"]

def counter_spiral(n):
    val = randint(0, len(col)-1)
    t.color(col[val])
    flag = 0
    i, j = 0, 0 # i for rows and j for columns

    while(i < n and j < n):
        # v = a[i][j]
        if flag == 1:
            t.right(90)
        for r in range(i, n):
            # a[r][j] = a[r+1][j]
            # print(a[r][j], end=' ')
            t.dot()
            t.forward(dot_separator)
        val = randint(0, len(col)-1)
        t.color(col[val])
        t.right(90)
        flag = 1

        for r in range(i+1, n):
            # a[n-1][r] = a[n-1][r+1]
            # print(a[n-1][r], end=' ')
            t.dot()
            t.forward(dot_separator)
        val = randint(0, len(col)-1)
        t.color(col[val])
        t.right(90)

        for r in range(n-2, i-1, -1):
            # a[r][n-1] = a[r-1][n-1]
            # print(a[r][n-1], end=' ')
            t.dot()
            t.forward(dot_separator)
        val = randint(0, len(col)-1)
        t.color(col[val])
        t.right(90)
        
        for r in range(n-2, j, -1):
            # a[i][r] = a[i][r-1]
            # print(a[i][r], end=' ')
            t.dot()
            t.forward(dot_separator)
        val = randint(0, len(col)-1)
        t.color(col[val])
        t.right(90)
        # if j+1 < n:
            # a[i][j+1] = v

        i = i + 1
        j = j + 1
        n = n - 1

# a = []
# n = int(input(''))
# count = 1
# for i in range(n):
#     l = []
#     for j in range(n):
#         l.append(count)
#         count = count + 1
#     a.append(l)
counter_spiral(4)