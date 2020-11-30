def solve(s):
    c0, c1 = 0, 0
    for i in s:
        if i == '0':
            c0 += 1
        else:
            c1 += 1
    if c0 == 1 or c1 == 1:
        print('YES', end='')
    else:
        print('NO', end='')

if __name__ == "__main__":
  s = input('')
  solve(s)