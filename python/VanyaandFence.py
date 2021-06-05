# str = input('')
# list = str.split(' ')
# map_object = map(int, list)
# int_list = list(map_object)
# n = int_list[0]
# k = int_list[1]
# width = 0
# while n > 0:
#     h = int(input(''))
#     if (h > k):
#         width = width + 2
#     else:
#         width = width + 1
#     n = n-1
# print(width)
def checkSubset(h, total, i, mem):
    key = str(total) +":"+str(i)
    if key in mem:
        return mem[key]
    if total == 0:
        return True
    elif i < 0 or total < 0:
        return False
    elif total < h[i]:
        value =  checkSubset(h, total, i-1, mem)
    else:
        value =  checkSubset(h, total-h[i], i-1, mem) or checkSubset(h, total, i-1, mem)
    mem[key] = value
    return mem[key]

def dp(h, total, i):
    mem = {}
    return checkSubset(h, total, i, mem)
s = list(map(int, input('').split(' ')))
for i in s:
    print(i)
# print(checkSubset(s, 10, len(s)-1))
print(dp(s, 10, len(s)-1))
