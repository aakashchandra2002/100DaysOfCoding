# create empty array 
array = []
evenArr = []
oddArr = []

# take input for array size
n = int(input("Enter the size of the array:"))

# append values in array
for i in range(0,n):
    number = int(input("Enter Element at {} index:".format(i)))
    array.append(number)
    if i % 2 == 0:
        evenArr.append(array[i])
    else:
        oddArr.append(array[i])
        
#sort even array        
evenArr = sorted(evenArr)
print("Sorted Even Array:", evenArr[0:len(evenArr)])

#sort odd array
oddArr = sorted(oddArr)
print("Sorted Odd Array:", oddArr[0:len(oddArr)])

# addition of second largest number 
print("The sum is: ",evenArr[-2] + oddArr[-2])
