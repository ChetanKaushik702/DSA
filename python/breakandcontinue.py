# Prompts the user to enter a number until the user enter a number greater than or equal to 100
while True:
    print('Enter number: ')
    n = int(input())
    if (n >= 100):
        break
    print('You entered', n)

#Notes
# list1 = [ ["Harry", 1], ["Larry", 2],
#           ["Carry", 6], ["Marie", 250]]
# dict1 = dict(list1)
#
# for item in dict1:
#     print(item)
# for item, lollypop in dict1.items():
#     print(item, "and lolly is ", lollypop)
# items = [int, float, "HaERRY", 5,3, 3, 22, 21, 64, 23, 233, 23, 6]

# for item in items:
#     if str(item).isnumeric() and item>=6:
#         print(item)
