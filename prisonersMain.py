import random
def prisoners(numOfPrisoners):
    arrayOfPrisoners = []
    arrayOfBoxes = []
    arrayOfNumbers = []
    boxes = {}
    for i in range(numOfPrisoners):
        arrayOfPrisoners.append(i)
    # for i in range(numOfPrisoners):
    #     arrayOfBoxes.append(i)
    for i in range(numOfPrisoners):
        arrayOfNumbers.append(i)
    random.shuffle(arrayOfNumbers)
    print("Prisoners:", arrayOfPrisoners)
    # print("Boxes:",arrayOfBoxes)
    print("Numbers:", arrayOfNumbers)
    for i in range(len(arrayOfNumbers)):
        boxes[i] = arrayOfNumbers[i]
    print("Boxes dictionary:", boxes)
    countOfBoxesChecked = 0
    boxCountCheckLimit = numOfPrisoners / 2
    for prisonerNumber in arrayOfPrisoners:
        print("Prisoner", prisonerNumber)
        print(boxes[prisonerNumber])
        currentBox = prisonerNumber
        while countOfBoxesChecked < boxCountCheckLimit:
            print("Check number", countOfBoxesChecked)
            print("Prisoner Number is", prisonerNumber, ". Box Number is", currentBox)
            if countOfBoxesChecked >= boxCountCheckLimit:
                print("Prisoners Failed")
                return False
            if boxes[currentBox] == prisonerNumber:
                print("Box has been found")
                countOfBoxesChecked = 0
                break
            else:
                currentBox = boxes[currentBox]
                countOfBoxesChecked += 1
    print("Prisoners Succeeded")
    return True

prisoners(100)