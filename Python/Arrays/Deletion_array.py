# Creating an array

arr = []
size = int(input("Enter the size of the array: "))
for i in range(0,size):
    val = int(input("Enter the value: "))
    arr.append(val)

# Deleting an element from array

n = int(input("Enter the value to be deleted: "))
arr.remove(n)
print("New Array: ", arr)