import random
def prisoners(numOfPrisoners):
    arrayOfPrisoners = []
    arrayOfBoxes = []
    arrayOfNumbers = []
    boxes = {}
    for i in range(numOfPrisoners):
        arrayOfPrisoners.append(i)
    for i in range(numOfPrisoners):
        arrayOfBoxes.append(i)
    for i in range(numOfPrisoners):
        arrayOfNumbers.append(i)
    random.shuffle(arrayOfNumbers)
    print("Prisoners:", arrayOfPrisoners)
    print("Boxes:",arrayOfBoxes)
    # for i in prisoners:
    return True

prisoners(100)