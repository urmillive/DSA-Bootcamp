import os
from datetime import datetime
import time
import glob

while True:
    for i in glob.glob("*.exe"):
        if os.path.getctime(i) <= datetime.now().timestamp()-1:
            os.remove(i)
            print("Deleted ", i)
    time.sleep(1)
