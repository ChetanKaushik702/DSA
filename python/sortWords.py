words = input('').split(',')
words = sorted(words)
for i in range(len(words)):
    if i < len(words)-1:
        print(words[i], end=',')
    else:
        print(words[i], end='')