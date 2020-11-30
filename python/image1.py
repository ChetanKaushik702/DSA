import numpy as np
from PIL import Image
arr = np.zeros([100, 200, 3], dtype=np.uint8)
arr[:, :100] = [255, 128, 0]
arr[:, 100:] = [0, 0, 255]
img = Image.fromarray(arr)
img.save("test.png")