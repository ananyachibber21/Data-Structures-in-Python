# Creating an array

arr = []
size = int(input("Enter the size of the array: "))
for i in range(0,size):
    val = int(input("Enter the value: "))
    arr.append(val)

# Inserting an element in an array

n = int(input("Enter the number you want to insert: "))
pos = int(input("Enter the position you want to insert: "))
if(pos>len(arr)):
    print("Index out of range. Please enter a smaller value!")
else:
    arr.insert(pos,n)
    print("New Array: ",arr)