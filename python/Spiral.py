n = int(input(''))
while n > 0:
    s = list(map(int, input('').split(' ')))
    r,c = s[0],s[1]
    if r%2 == 1 and r >= c:
        print((r-1)*(r-1)+c)
    elif r%2 == 0 and r >= c:
        print(r*r - c + 1)
    elif c%2 == 1 and c >= r:
        print(c*c - r + 1)
    elif c%2 == 0 and c >= r:
        print((c-1)*(c-1) + r)
    n = n-1