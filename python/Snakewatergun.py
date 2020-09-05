# Snake Water Gun game
import random
str = ['S', 'W', 'G']
user_score, system_score = 0, 0
print('You have 10 moves in total')
i = 1
while i < 11:
    print('You have', 11-i, 'moves left')
    print('Enter S for Snake')
    print('Enter W for Water')
    print('Enter G for Gun')
    user_choice = input('')
    system_choice = random.choice(str)
    if user_choice == 'S':
        if system_choice == 'W':
            user_score = user_score + 1
        else:
            system_score = system_score + 1
    elif user_choice == 'W':
        if system_choice == 'G':
            user_score = user_score + 1
        elif  system_choice == 'S':
            system_score = system_score + 1
    else:
        if system_choice == 'S':
            user_score = user_score + 1
        elif system_choice == 'W':
            system_score = system_score + 1
    i = i+1
    print()
    
if system_score == user_score:
    print('Match drawn')
elif system_score < user_score:
    print('Congrats!! You won')
else:
    print('Oops!! You lose')
print('Your score:', user_score, 'System scores: ', system_score)