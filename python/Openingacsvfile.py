
import csv      #importing csv module to read the Sample.csv file
import matplotlib.pyplot as plt     #importing module matplotlib to plot histogram

alphabet = []       #declaring a list to store English alphabets
char = 65           #variable containing the ASCII value of 'A'

# Storing the capital letters in list alphabet 
while char <= 90:
    alphabet.append(chr(char))
    char += 1

# Storing the small letters in list alphabet
char = 97
while char <= 122:
    alphabet.append(chr(char))
    char += 1

# creating and initializing the frequencies corresponding to letters in the list alphabet in list num to 0
char = 0
num = []
while char <= 51:
    num.append(0)
    char += 1 

# Opening the Sample.csv file 
with open('Sample.csv') as file:
    reader = csv.reader(file)
    count = 0   #using count to not read "content" line  
    for row in reader:
        str = row[3]    #storing the row data read from the content column 
        if count >= 1:
            # print(str)
            for ch in str:      #reading the line in the content column character-by-character
                if ch in alphabet:      #checking for English alphabet 
                     num[alphabet.index(ch)] += 1       #incrementing ch's corresponding frequency by 1  
        count += 1
    # print(count)

    #defining the bin 
    bins = [100, 300, 1200, 2000, 4000, 20000, 70000, 100000, 120000, 140000]

    #plotting the histogram
    plt.hist(num, bins=bins, color='green', edgecolor='white')
    plt.title('Number of letters in the content section')
    plt.ylabel('Number of letters')
    plt.xlabel('Frequencies')
    plt.show()
    #closing the Sample.csv file
    file.close()

