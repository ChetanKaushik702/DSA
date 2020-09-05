# str = input()
# lis = str.split(' ')
# lt = list(map(int, lis))
# print(lt+1)
inp = input()
lt = inp.split(' ')
nums = list(map(int, lt))
a = nums[0]
b = nums[1]
h = a
while a >= b:
    g = a // b
    r = a % b
    h = h + a
    a = g + r
print(h)