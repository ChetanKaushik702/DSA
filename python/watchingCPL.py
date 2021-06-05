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

if __name__ == '__main__':
    t = int(input(''))
    while t > 0:
        s = list(map(int, input('').split(' ')))
        n = s[0]
        k = s[1]
        lt = []
        s = list(map(int, input('').split(' ')))
        for inp in s:
            lt.append(inp)
        if n == 1:
            print(-1)
        elif sum(lt) < (k << 1):  #sum < 2*k
            print(-1)
        else:
            lt = sorted(lt, reverse=True)
            if (lt[0] >= k):   #list[max] >= k
                flag = 0
                s = 0
                for i in range(1, n):
                    s += lt[i]
                    if (s >= k):
                        print(i+1)
                        flag = 1
                        break
                if flag == 0:
                    print(-1)
            else:
                if sum(lt) == (k << 1):
                    # i=n-1
                    # flag=False
                    # search = k-lt[0]
                    # while search > 0 and i >= 0:
                    #     if (lt.count(search) >= 1):
                    #         flag = True
                    #         break
                    #     else:
                    #         search = search - lt[i]
                    #         i -= 1
                    # if flag:
                    #     print(n)
                    # else:
                    #     print(-1)
                    if dp(lt, k, len(lt)-1):
                        print(n)
                    else:
                        print(-1)
                else:
                    s = 0
                    l = []
                    for i in range(n):
                        s += lt[i]
                        if (s >= 2*k):
                            for j in range(i+1):
                                l.append(lt[j])
                            break
                    # checking for sum == 2k
                    # if (sum(l) == (k << 1)):
                    #     if dp(l, k, len(l)-1):
                    #         print(len(l))
                    # else:
                    if dp(l, k, len(l)-1):
                            print(len(l))
                    else:
                        # print("l:", l)
                        l1 = [l[0]]
                        s = l[0]
                        idx = -1
                        for i in range(len(l)-1, 0, -1):
                            s += l[i]
                            l1.append(l[i])
                            if (s >= k):
                                idx = i
                                break
                        # print("l1:", l1)
                        # print("idx:", idx)
                        l2 = []
                        for i in range(1, idx):
                            l2.append(l[i])
                        # print("l2:", l2)
                        if (sum(l2) >= k):
                            print(len(l2) + len(l1))
                        else:
                            flag = False
                            s = sum(l2)
                            for i in range(len(l)-1, n):
                                s += lt[i]
                                l2.append(lt[i])
                                if s >= k:
                                    flag = True
                                    break
                            if flag:
                                print(len(l2) + len(l1))
                            else:
                                print(-1)
        t -= 1