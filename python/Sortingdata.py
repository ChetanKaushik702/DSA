def insertionSort(list):
    for i in range(1, len(list)):
        key = list[i][0]
        value = list[i]
        j = i-1
        while j >= 0 and key < list[j][0]:
            list[j+1] = list[j]
            j = j-1
        list[j+1] = value