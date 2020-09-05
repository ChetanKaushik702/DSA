# This is a single-line comment
""" This
    is
    a
    multi-line
    comment
"""
#taking user input, it's always in the string form 
print ('Enter first number:', end=" ") # I am a comment after line
n1 = input()
print ("Enter second number:", end=" ") # It will be displayed onto the standard output stream
n2 = input()
print ('Sum of ',n1 , 'and ', n2, ' is: ', int(n1) + int(n2))

#defining a string variable
var1 = "I am a string"
print (type(var1))     #displaying type of var1
print("String: ", var1)    #displaying the string

#printing the length of the above string
print ('Length of the string: ', len(var1))

#printing a character in the string at a specific location
print(var1[5])

#printing a substring of the above string
print (var1[::-1]) #naive way of reversing a string

print(var1.endswith("string"))

print(var1.replace("I am", "this is"))

print(var1.capitalize())

print(var1.lower())

print(var1.upper())

print(var1.count("a"))

print(var1.find("a"))

print(var1.isalnum())

print(var1.isalpha())

print(var1.isnumeric())

