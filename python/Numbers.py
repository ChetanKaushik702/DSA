def isEvenDig(n):
    flag=True
    while n != 0:
        print(n)
        if (n % 10)%2 == 1:
            flag = False
            break
        n = n//10
    return flag
s = list(map(int, input('').split(',')))
m, n = s[0], s[1]
if m % 2 == 1:
    m = m+1
ans = []
for i in range(m, n+1, 2):
    if i % 2 == 0 and isEvenDig(i):
       ans.append(i)

for i in range(len(ans)):
    if i < len(ans)-1:
        print(ans[i], end=',')
    else:
        print(ans[i], end='')