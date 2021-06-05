def cmpName(email):
    b, e = -1, -1
    for i in range(len(email)):
        if email[i] == '@':
            b = i+1
        elif email[i] == '.':
            e = i
            break
    return email[b:e]

if __name__=='__main__':
    email = input('')
    print(cmpName(email))