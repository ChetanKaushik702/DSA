str = input('')
list = str.split(' ')
map_object = map(int, list)
int_list = list(map_object)
n = int_list[0]
k = int_list[1]
width = 0
while n > 0:
    h = int(input(''))
    if (h > k):
        width = width + 2
    else:
        width = width + 1
    n = n-1
print(width)