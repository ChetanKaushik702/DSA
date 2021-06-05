# checking for a subset with sum total
def checkSubset(h, total, i, mem):
    key = str(total) +":"+str(i)
    if key in mem:
        return mem[key]
    elif total == 0:
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

# driver method
if __name__ == "__main__":
    t = int(input(''))
    while t > 0:
        inp = list(map(int, input('').split(' ')))
        n, k = inp[0], inp[1]
        inp = list(map(int, input('').split(' ')))
        lt = []
        for x in inp:
            lt.append(x)

        # logic starts here
        if n == 1:
            print(-1)
        elif sum(lt) < 2*k:
            print(-1)
        else:
            # sort the array in descending order
            lt = sorted(lt, reverse=True)

            #check if lt[0] >= k
            if lt[0] >= k:
                s = 0
                flag = False
                for i in range(1, n):
                    s += lt[i]
                    if s >= k:
                        print(i+1)
                        flag = True
                        break
                if not flag:
                    print(-1)
            else: # the case when lt[0] < k

                # check if sum is 2k
                if sum(lt) == 2*k:
                    # check if subsequence of sum k exists or not
                    if dp(lt, k, len(lt)-1):
                        print(n)
                    else:
                        print(-1)
                else: # sum is greater than 2k

                    # find a subarray that just adds upto 2k or more
                    l = []
                    s = 0
                    for i in range(n):
                        s += lt[i]
                        if s >= 2*k:
                            for j in range(i+1):
                                l.append(lt[j])
                            break
                    # print("l:", l)
                    #check if the sum of array l is 2k or not
                    if sum(l) == 2*k:
                        #check if it can be splitted into two equal halves
                        if dp(l, k, len(l)-1):
                            print(len(l))
                        else:
                            print(-1)
                    else:
                        # check if there is any subsequence adds upto k or not
                        if dp(l, k, len(l)-1):
                          print(len(l))
                        else:
                            # find the two subarrays that adds upto atleast k
                            l1 = [l[0]]
                            s = l[0]
                            for i in range(len(l)):
                                if s >= k:
                                    break
                                s += l[len(l)-i-1]
                                l1.append(l[len(l)-i-1])
                            # print("l1:", l1)
                            l2 = []
                            s = 0
                            for x in l:
                                if x not in l1:
                                    s += x
                                    l2.append(x)
                                    if s >= k:
                                        break
                            # print("l2:", l2)
                            # check if l2 adds upto atleast k or not
                            if sum(l2) >= k:
                                print(len(l2) + len(l1))
                            else:
                                # start adding the remaining elements from the original list to make the sum of l2 at least k
                                s = sum(l2)
                                for i in range(len(l), n):
                                    # print(lt[i])
                                    s += lt[i]
                                    l2.append(lt[i])
                                    if s >= k:
                                        break
                                # print("mod l2:", l2)
                                # again check if l2 adds upto atleast k or not
                                if sum(l2) >= k:
                                    print(len(l1) + len(l2))
                                else:
                                    print(-1)
        t-=1
    pass