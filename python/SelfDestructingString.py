import math
s = input('')
if len(s)%2 == 1:
    print(-1)
else:
    zeros, ones = 0, 0
    for i in s:
        if i == '0':
            zeros += 1
        else:
            ones += 1
    if zeros == ones:
        print(0)
    else:
        print(math.abs(zeros-ones)//2)