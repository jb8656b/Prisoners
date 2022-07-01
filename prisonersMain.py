import random
def prisoners(numOfPrisoners):
    arrayOfPrisoners = []
    arrayOfBoxes = []
    for i in range(numOfPrisoners):
        arrayOfPrisoners.append(i)
    print(arrayOfPrisoners)
    for i in range(numOfPrisoners):
        arrayOfBoxes.append(i)
    random.shuffle(arrayOfBoxes)
    print(arrayOfBoxes)
    return True

prisoners(100)