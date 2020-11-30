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

def spiral(m, n):
    k = 0  # row-index
    l = 0  # column-index
    val = randint(0, len(col)-1)
    t.color(col[val])
    flag = 0
    while k < m and l < n:
        if flag == 1:
            t.right(90)

        # print the first row
        for i in range(l, n):
            t.dot()
            t.forward(dot_separator)
        k = k + 1 
        flag = 1
        t.right(90)

        val = randint(0, len(col)-1)
        t.color(col[val])
        # print the last column contents
        for i in range(k, m):
            t.dot()
            t.forward(dot_separator)
        n = n - 1
        t.right(90)

        val = randint(0, len(col)-1)
        t.color(col[val])
        if k < m:
            # print the last row in reverse order
            for i in range(n-1, l-1, -1):
                t.dot()
                t.forward(dot_separator)
            m = m - 1
        t.right(90)
        val = randint(0, len(col)-1)
        t.color(col[val])
        if l < n:
            # print the first column in reverse order
            for i in range(m-1, k-1, -1):
                t.dot()
                t.forward(dot_separator)
            l = l + 1

spiral(20, 20)
turtle.done()