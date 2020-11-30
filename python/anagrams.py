string1 = input('Enter a string: ')
string2 = input('Enter another string: ')

# string1 = sorted(string1)
# string2 = sorted(string2)

# if len(string1) != len(string2):
#     print('Not anagrams')
# else:
#     flag = 1
#     for i in range(len(string1)):
#         if string1[i] != string2[i]:
#             flag = 0
#             break
#     if flag == 1:
#         print('Anagrams')
#     else:
#         print('Not anagrams')
if sorted(string1) == sorted(string2):
    print("These are Anagrams")
else:
    print("These aren\'t Anagrams")