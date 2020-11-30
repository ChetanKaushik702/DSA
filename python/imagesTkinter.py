from tkinter import *
from PIL import Image, ImageTk
import os
root = Tk()
# root.geometry("1080x720")
path = os.chdir(r'C:\Users\DELL\OneDrive\Desktop\nature')
for f in os.listdir(path):
    if f.endswith('.jpg'):
        im = Image.open(f)
        # im.show()
        root.geometry("1080x720")
        ph = ImageTk.PhotoImage(im)
        Label(image=ph).pack()
        root.mainloop()