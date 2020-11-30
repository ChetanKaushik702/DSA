import turtle
turtle.bgcolor("black")
t = turtle.Turtle()
width = 5
height = 7
dot_separator = 25
t.setpos(-250, 250)

def spiral(m, n):
    k = 0  # row-index
    l = 0  # column-index
    t.color("white")
    flag = 0
    while k < m and l < n:
        if flag == 1:
            t.right(90)

        # print the first row
        for i in range(l, n):
            t.forward(dot_separator)
        k = k + 1 
        flag = 1
        t.right(90)

        # print the last column contents
        for i in range(k, m):
           t.forward(dot_separator)
        n = n - 1
        t.right(90)

        if k < m:
            # print the last row in reverse order
            for i in range(n-1, l-1, -1):
                t.forward(dot_separator)
            m = m - 1
        t.right(90)

        if l < n:
            # print the first column in reverse order
            for i in range(m-1, k-1, -1):
                t.forward(dot_separator)
            l = l + 1

spiral(22, 22)
turtle.done()