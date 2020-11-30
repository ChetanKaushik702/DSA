num = input('')
num = num.split(' ')
num = list(map(int, num))
r = num[0]
c = num[1]
mat = []
for i in range(r):
  r_i = []
  for j in range(c):
    r_i.append(0)
  mat.append(r_i)

val = 1
for i in range(r):
  for j in range(c):
    mat[i][j] = val
    print(mat[i][j], end=' ')
    val = val+1
  print()