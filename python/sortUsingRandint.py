import random
n = int(input(''))
arr = [0]*n
for i in range(n):
    arr[i] = int(input(''))

def isSorted(arr):
    flag = True
    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]:
            flag = False
            break
    if flag:
        return True
    else:
        return False

def sortArr(arr):
    while(not(isSorted(arr))):
        i = random.randint(0, len(arr)-1)
        j = random.randint(0, len(arr)-1)
        if i != j:
            arr[i] = arr[i] + arr[j]
            arr[j] = arr[i] - arr[j]
            arr[i] = arr[i] - arr[j]

sortArr(arr)
for value in arr:
    print(value, end=' ')