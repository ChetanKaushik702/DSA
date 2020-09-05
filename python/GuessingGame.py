# It is a guessing game
num = 18
noOfGuesses = 9
while True:
    print('Guesses left:', noOfGuesses)
    print('Enter a number: ', end = "")
    user_num = int(input())
    if (user_num > num):
        print('Number is less than', user_num)
    elif user_num == num:
        print('Hurrah!! You won in', 9-noOfGuesses, 'moves.')
        break
    else:
        print('Number is greater than', user_num)
    noOfGuesses = noOfGuesses - 1
    if noOfGuesses == 0:
        print('GAME OVER!! No more guesses left.')
        break
    print('\n')

