class Email:
  institution = "JCBOSEUST"
  passwordLength = 12
  mailboxCapacity = 200
  alternatemail = ''
  resetPassword = ''
  
  def __init__(self):
    self.firstName = input('Enter student\'s first name: ')
    self.lastName = input('Enter student\'s last name: ')
    self.department()
  
  def department(self):
    print('Enter department:\n1 for Computer Engineering\n2 for Mechanical Engineering\n3 for Electrical Engineering\n4 for Electronics Engineering\n5 for Chemical Engineering\n6 for Civil Engineering')
    choice = int(input())
    if choice == 1:
      self.dept = "Computer Engineering"
    elif choice == 2:
      self.dept = "Mechanical Engineering"
    elif choice == 3:
      self.dept = "Electrical Engineering"
    elif choice == 5:
      self.dept = "Chemical Engineering"
    elif choice == 6:
      self.dept = "Civil Engineering"
    elif choice == 4:
      self.dept = "Electronics Engineering"
    else:
      print('Incorrect choice')
    
  def getEmail(self):
    temp = self.dept
    department = temp.split(' ')
    return f"{self.firstName.lower()}.{self.lastName.lower()}.@{department[0].lower()}.{self.institution.lower()}.ac.in"
  
  def getPassword(self):
    import random
    random_password = "A1!aB2@bC3#cD4$dE5eF6^fG&g7H8*hI(i~J:9)jK_-kL<?lM|m*N&n+O=o{P]p}Q[q*R^r,S/s?T;tU:uVv!@Ww#$x^Y&yZ\z"
    self.password = ''
    for i in range(1, self.passwordLength):
      self.password = self.password + random_password[random.randint(0, len(random_password)-1)]
    return self.password
  
  def alternateMail(self, altmail):
    self.alternatemail = altmail

  def setMailCapacity(self, capacity):
    self.mailboxCapacity = capacity

  def resetpass(self, password):
    self.resetPassword = password
  
  def printDetails(self):
    return f"Student's Name: {self.firstName} {self.lastName}\nDepartment: {self.dept}\nE-mail id: {self.getEmail()}\nPassword: {self.getPassword()}"


class Student(Email):
  def dataList(self):
    list = []
    name = self.firstName.capitalize() +" "+ self.lastName.capitalize()
    list.append(name)
    list.append(self.dept)
    list.append(self.getEmail())
    list.append(self.getPassword())
    return list

def insertionSort(list, value):
  for i in range(1, len(list)):
    key = list[i][value]
    data = list[i]
    j = i-1
    while j >= 0 and key < list[j][value]:
      list[j+1] = list[j]
      j = j-1
    list[j+1] = data

if __name__ == "__main__":
  noOfSts = int(input('Enter the number of students to enroll: '))
  data_list = []
  for i in range(0, noOfSts):
    user = Student()
    data_list.append(user.dataList())
    print()
  insertionSort(data_list, 1)
  insertionSort(data_list, 0)

# printing data in an excel file
import xlsxwriter as xw
outWorkbook = xw.Workbook("out.xlsx")
outSheet = outWorkbook.add_worksheet()
outSheet.write("B1", "Student's names")
outSheet.write("A1", "Student's id")
outSheet.write("C1", "Department")
outSheet.write("D1", "E-mail id")
outSheet.write("E1", "Password")

id = 3001
for i in range(len(data_list)):
  outSheet.write(i+1, 0, id)
  id = id+1
  for j in range(len(data_list[i])):
    outSheet.write(i+1, j+1, data_list[i][j])
  
outWorkbook.close()