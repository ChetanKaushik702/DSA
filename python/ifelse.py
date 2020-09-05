#if-else ladder
print('Enter your age: ', end="")
age = int(input())

if age >= 7 and age <=100:
    if age > 18:
        print('You are eligible for driving.')
    elif age == 18:
        print('You have to come to our office and then we\'ll decide whether you can drive or not.')
    else :
        print('You aren\'t eligible for driving.')
else:
    print('You shouldn\'t even think of driving.')
