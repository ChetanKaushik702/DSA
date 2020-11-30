def uncommonLetters(p1, p2):
    count = 0
    for i in range(len(p1)):
        for j in range(len(p2)):
            if p1[i] == p2[j]:
                count += 1
                p2[j] = '#'

    return len(p1)+len(p2)-2*count

def relation(p1, p2):
    count = uncommonLetters(p1, p2)
    s = ['Friend', 'Love', 'Affection', 'Marriage', 'Enemy', 'Sibling']
    while len(s) > 1:
        split_index = (count%len(s)-1)
        if split_index >= 0:
            left = s[:split_index]
            right = s[split_index+1:]
            s = right + left
        else:
            s = s[:split_index]
    print(s[0])

if __name__ == "__main__":
    p1 = list(input("Enter player1's name, please: ").replace(" ", ""))
    p2 = list(input('Enter player2"s name, please: ').replace(" ", ""))
    relation(p1, p2)