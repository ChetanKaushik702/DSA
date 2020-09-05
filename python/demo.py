inp = input()
str = list(inp.split(' '))
out = list(map(int, str))
n = out[0]
a = out[1]
b = out[2]
if n > a + b + 1:
    a = a + (n-a-b-1)
print(n-a)