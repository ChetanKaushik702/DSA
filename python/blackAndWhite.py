import cv2

#opening an image
img = cv2.imread(r"C:\Users\DELL\OneDrive\Desktop\Image.jpg")

#set up for converting an image to black-n-white

#preparation of CLAHE
clahe = cv2.createCLAHE()

#Convert to gray-scale
gray_img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#apply enhancement
enh_img = clahe.apply(gray_img)

#write it to a file
cv2.imwrite(r"C:\Users\DELL\OneDrive\Desktop\Enhanced-image.jpg", enh_img)

print("Done enhacement")