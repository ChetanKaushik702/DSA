import math
n = int(input(''))
x, y =0, 0
for i in range(n):
  str = input('').split(' ')
  if str[0] == 'UP':
    y = y + int(str[1])
  elif str[0] == 'DOWN':
    y = y - int(str[1])
  elif str[0] == 'LEFT':
    x = x - int(str[1])
  else:
    x = x + int(str[1])
#print(x, y)
print(int(round(math.sqrt(x*x + y*y))), end='')