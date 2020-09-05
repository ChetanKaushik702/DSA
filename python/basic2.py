# creating a dictionary
dictionary = {"Mutable":"Anything that can be changed", 
              "Immutable":"Anything that can't be changed", 
              "List":"Collection of same or different type of elements. Mutable", 
              "Tuple":"Collection of same or different type of elements. Immutable",
              "String":"Collection of characters",
              "Dictionary":"Collecton of key-value pairs"
              }
print ('Enter a word whose meaning you want to know: ', end="")
word = input()
meaning = dictionary[word]
print ('Meaning of the word', word, 'is', meaning)

