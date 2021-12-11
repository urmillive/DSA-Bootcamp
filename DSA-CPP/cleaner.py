from os import remove
from os.path import getctime
from time import sleep, time
from glob import glob

while True:
    for i in glob("*.exe"):
        if getctime(i) <= time()-1:
            remove(i)
            print("Deleted ", i)
    sleep(1)
