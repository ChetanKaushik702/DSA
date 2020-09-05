# dictionary consists of key-value pairs
dict = {"A":"0", "B":"0"}
list = [0, 0]
str = "ABABAB"
for char in str:
    if char == 'A':
        list[0] += 1
    elif char == 'B':
        list[1] += 1
list.append(3)
print(list)


