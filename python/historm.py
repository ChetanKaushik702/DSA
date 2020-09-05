import matplotlib.pyplot as plt
import numpy as np
a_list = [4590, 2931, 2601, 2822, 3137, 1909, 2408, 3399, 14553, 1564, 1140, 3076, 3874, 2898, 3701, 1968,
          172, 2161, 4832, 4961, 1346, 738, 2898, 280, 1665, 203, 104976, 21775, 30787, 47425, 139348, 22594, 35587,
          63559, 89356, 3921, 20144, 57287, 41888, 88154, 117364, 23251, 1613, 65767, 77118, 117569, 41622, 12895, 
          32146, 3646, 39604, 2310]

bins = [100, 300, 1200, 2000, 4000, 20000, 70000, 100000, 120000, 140000]
plt.hist(a_list, bins=bins, color="blue", edgecolor='white')
plt.title('Analysis of number of letters in a data source')
plt.ylabel('Number of letters')
plt.xlabel('Frequencies')
plt.tight_layout()
plt.show()