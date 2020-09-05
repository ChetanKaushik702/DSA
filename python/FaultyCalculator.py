# This program performs wrong computations for the following inputs: 45 * 3 = 555, 56 + 9 = 77, 56 / 6 = 4
print ('Enter an operator: ', end="")
op = input()
print ('Enter two numbers: ', end="")
num1 = float(input())
num2 = float(input())

if (num1 == 45 and num2 == 3):
    if op == '*':
        print('555')
elif (num1 == 56 and num2 == 9):
    if op == '+':
        print('77')
elif (num1 == 56 and num2 == 6):
    if op == '/':
        print('4')
elif op == '+':
    print(num1 + num2)
elif op == '-':
    print(num1-num2)
elif op == '/':
    print(num1/num2)
else:
    print(num1*num2)