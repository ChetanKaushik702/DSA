import numpy as np
import pandas as pd
labels = ['a', 'b', 'c']
my_list = [10, 20, 30]
arr = np.array([10, 20, 30])
d = {'a':10, 'b':20, 'c':30}

print(pd.Series(data=my_list))
print()
print(pd.Series(d))
print()
print(pd.Series(data=labels, index=arr))