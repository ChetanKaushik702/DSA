from PIL import Image
#opening image
img = Image.open(r'C:\Users\DELL\OneDrive\Desktop\Image.jpg')
new_img = img.resize((1280, 720))
new_img.save(r'C:\Users\DELL\OneDrive\Desktop\full.jpg')
#getting the mirror image
rot_img = img.transpose(Image.FLIP_TOP_BOTTOM)

#saving the mirror image
rot_img.save(r'C:\Users\DELL\OneDrive\Desktop\mirror2.jpg')