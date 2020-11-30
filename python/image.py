from PIL import Image
im = Image.open('snakeandladder.jpg')
new_im = im.resize((1920, 1080))
new_im.save('snakeAndLadder.jpg')