# def insertionSort(list):
#     for i in range(1, len(list)):
#         key = list[i][0]
#         value = list[i]
#         j = i-1
#         while j >= 0 and key < list[j][0]:
#             list[j+1] = list[j]
#             j = j-1
#         list[j+1] = value
l = [10, 9, 8, 7]
l1 = [l[0]]
sum = l1[0]
k = 34
for i in range(len(l)-1, 0, -1):
    print(i)
    if (sum >= k):
        break
    sum += l[i]
    l1.append(l[i])
print(l1)
