import random
def prisoners(numOfPrisoners):
    # This function returns True if the prisoners
    # succeed, returns false if the prisoners fail
    arrayOfPrisoners = []
    arrayOfNumbers = []
    boxes = {}
    for i in range(numOfPrisoners):
        arrayOfPrisoners.append(i)
    for i in range(numOfPrisoners):
        arrayOfNumbers.append(i)
    random.shuffle(arrayOfNumbers)
    # print("Prisoners:", arrayOfPrisoners)
    # print("Numbers:", arrayOfNumbers)
    for i in range(len(arrayOfNumbers)):
        boxes[i] = arrayOfNumbers[i]
    # print("Boxes dictionary:", boxes)
    countOfBoxesChecked = 0
    boxCountCheckLimit = numOfPrisoners / 2
    for prisonerNumber in arrayOfPrisoners:
        # print("Prisoner", prisonerNumber)
        currentBox = prisonerNumber
        while countOfBoxesChecked <= boxCountCheckLimit:
            # print("Check number", countOfBoxesChecked)
            # print("Prisoner Number is", prisonerNumber, ". Box Number is", currentBox)
            if countOfBoxesChecked >= boxCountCheckLimit:
                # print("Prisoners Failed")
                return False
            if boxes[currentBox] == prisonerNumber:
                # print("Box has been found")
                break
            else:
                currentBox = boxes[currentBox]
                countOfBoxesChecked += 1
        countOfBoxesChecked = 0
    # print("Prisoners Succeeded")
    return True

successes = 0
fails = 0
for i in range(1000000):
    value = prisoners(100)
    if value == True:
        successes += 1
    if value == False:
        fails += 1
print("Successes:", successes)
print("Fails:", fails)