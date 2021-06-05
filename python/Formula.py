import math
s = list(map(int, input('').split(',')))
for i in range(len(s)):
    if i < len(s)-1:
        print(round(math.sqrt(2*50*s[i]/30)), end=',')
    else:
        print(round(math.sqrt(2*50*s[i]/30)), end='')