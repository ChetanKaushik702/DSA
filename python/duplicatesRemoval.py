s = input('').split(' ')
a = []
for i in s:
  a.append(int(i))
# print(a)
def removeDuplicates(a):
    size = len(a)
    i = 0
    while i < size:
      j = i+1
      while j < size:
        if a[i] == a[j]:
          k = j
          while k <size-1:
            a[k] = a[k+1]
            k += 1
          j -= 1
          size -= 1
        j += 1
      i += 1
    return size
size = removeDuplicates(a)
# print(size)
# print(a)
for i in range(size-1):
  print(a[i], end=' ')
print(a[size-1])