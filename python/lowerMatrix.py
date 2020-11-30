n = int(input(''))
m = []
for i in range(n):
  s = input('').split(' ')
  lt = []
#   m.append(lt)
  for j in range(n):
    lt.append(int(s[j]))
  m.append(lt)

def lowerTriMat(mat):
  for i in range(n):
    for j in range(i+1, n):
      mat[i][j] = 0

lowerTriMat(m)
for i in range(n):
  for j in range(n):
    print(m[i][j], end=' ')
  if i <= n-2:
    print()