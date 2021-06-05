def solve(mat, m, n):
    ans= ''
    for j in range(m):
        for i in range(n):
            if mat[i][j] == '!' or mat[i][j] == '@' or mat[i][j] == '#' or mat[i][j] == '$' or mat[i][j] == '%' or mat[i][j] == '&':
                continue
            ans += mat[i][j]
    print(ans, end='')
    pass

if __name__ == '__main__':
    t = list(map(int, input('').split(' ')))
    n, m = t[0], t[1]
    mat = []
    for i in range(n):
        s = input('').split(' ')
        mat.append(s)
    solve(mat, m, n)