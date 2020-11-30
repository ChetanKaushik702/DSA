with open('file.txt', 'w') as myfile:
    myfile.write('Hey! I am writing.');
myfile.close()
with open('file.txt', 'w') as f:
    f.write('Hey I am writing the second line.');
f.close()
with open('file.txt', 'r') as f:
    print(f.read())
f.close()