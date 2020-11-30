from statistics import mean
from scipy import stats
def trimmedMean(data):
    data.sort()
    n = int(0.1*len(data))
    data = data[n:]
    data = data[:len(data)-n]
    mean = 0
    for i in data:
        mean = mean + i
    print(mean/len(data))
data = [1, 2, 1, 3, 2, 1, 2, 5, 5, 10, 22, 20, 24, 129, 500, 23, 356, 2345]
data.sort()
print(stats.trim_mean(data, 0.1))
trimmedMean(data)
# for i in range(len(data)):
#     print(data[i])