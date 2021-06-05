import pandas as pd
import numpy as np
df = pd.read_csv(r"C:\\Users\\kaush\\Desktop\\Lesson 3 Practice\\Lesson 3 Practice\\Salaries.csv", delimiter=',')
names = np.array(df['EmployeeName'])
titles = np.array(df['JobTitle'])
totalPay = np.array(df['TotalPay'])

for i in range(10):
    print(names[i], titles[i], totalPay[i])