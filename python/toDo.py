from datetime import date
import string
import random
import datetime
to_do = ['Charging', 'Breakfast', 'Lunch']
to_do.remove('Charging')
# print(to_do)
LOT_BOX = list(string.ascii_uppercase)
# print(random.choice(LOT_BOX))
# print(datetime.datetime.now().strftime('%x'))
# print(datetime.datetime.now().strftime('%C'))
# print(datetime.datetime.now().strftime('%c'))
# print(datetime.datetime.now().strftime('%B'))
for i in range(10, 2, -2):
    print(i)