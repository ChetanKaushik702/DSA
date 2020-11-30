from PIL import Image
im=Image.open("test.png")
rgb_im = im.convert('RGB')
r, g, b = rgb_im.getpixel((1, 1))
print(r, g, b)
r, g, b = rgb_im.getpixel((150, 2))
print(r, g, b)