def count(s):
    u, l = 0, 0
    for c in s:
        if c >= 'A' and c <= 'Z':
            u += 1
        elif c >= 'a' and c <= 'z':
            l += 1
    print(u, l, end='')

if __name__ == '__main__':
    s = input('')
    count(s)