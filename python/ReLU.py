import numpy as np
x = np.array([-1.1, 2.1, -4.1, 5.1, 1.1])
print(x)
print(np.abs(x)-x)
print(np.multiply(x, x>0))
print((np.abs(x)+x)/2)  #ReLU
print(np.dot(np.transpose(x), x > 0))