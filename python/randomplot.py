import numpy as np
import matplotlib.pyplot as plt
ages = [18, 19, 21, 25, 26, 26, 30, 32, 48, 45, 55]

bins = [10, 20, 30, 40, 50, 60]
plt.hist(ages, color='skyblue', edgecolor='white', bins=bins)
plt.title('Ages of Residents')
plt.xlabel('Ages')
plt.ylabel('Number of residents')
plt.show()