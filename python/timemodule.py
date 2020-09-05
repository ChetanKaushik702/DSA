import time
initial = time.time()
for i in range(10):
    print('I am learning python.')
    time.sleep(1)
print('Total time taken is ', time.time()-initial, 'seconds')

current_time = time.asctime(time.localtime(time.time()))
print('Time:', current_time)
