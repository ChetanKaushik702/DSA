from tkinter import *
root = Tk()
root.title("Buttons")
root.geometry("655x333")

def name():
    print('Chetan Kaushik')

def number():
    print('9671807876')

def branch():
    print('Computer Engineering')

frame = Frame(root, borderwidth=6, bg="grey", relief=SUNKEN)
frame.pack(side=LEFT, anchor="nw")

b1 = Button(frame, fg="blue", text="Student's name", command=name)
b1.pack(side=LEFT, padx=20)

b2 = Button(frame, fg="blue", text="Contact no", command=number)
b2.pack(side=LEFT, padx=20)

b3 = Button(frame, fg="blue", text="Branch", command=branch)
b3.pack(side=LEFT, padx=20)

root.mainloop()