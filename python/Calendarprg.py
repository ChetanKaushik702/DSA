import calendar

def check_leap(y):
    if y%400 == 0 or y%100 != 0 and y % 4 == 0:
        return 1
    else:
        return 0

def check_valid_date(d, m, y, l):
    if l == 1: # for February
        if m == 2:
            if d < 30:
                return True
            else:
                return False
        else:
            if m <= 7:
                if m % 2 == 1:
                    if d < 32:
                        return True
                    else:
                        return False
                else:
                    if d < 31:
                        return True
                    else:
                        return False
            elif m > 8:
                if m % 2 == 1:
                    if d < 31:
                        return True
                    else:
                        return False
                else:
                    if d < 32:
                        return True
                    else:
                        return False
            else:
                return False
    else:
        if m == 2:
            if d < 29:
                return True
            else:
                return False
        else:
            if m <= 7:
                if m % 2 == 1:
                    if d < 32:
                        return True
                    else:
                        return False
                else:
                    if d < 31:
                        return True
                    else:
                        return False
            elif m > 8:
                if m % 2 == 1:
                    if d < 31:
                        return True
                    else:
                        return False
                else:
                    if d < 32:
                        return True
                    else:
                        return False
            else:
                return False

def get_day(i):
    days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    return days[i]

if __name__ == '__main__':
    year, month, date = 0, 0, 0
    while 1:
        year = int(input('Enter year (from 1970): '))
        if year < 1970 or year > 2020 :
            print('Enter a valid year starting from 1970')
        else:
            break
    while 1:
        month = int(input('Enter month (1-12): '))
        if month < 1 or month > 12 :
            print('Enter a valid month between 1 to 12')
        else:
            break
    leap = check_leap(year)
    while 1:
        date = int(input('Enter a date: '))
        if date > 0 and check_valid_date(date, month, year, leap):
            break
        else:
            print('Enter a valid date: ')
    
    day_index = calendar.weekday(year, month, date)
    day = get_day(day_index)
    print(date, '/', month, '/', year, "falls on", day)
