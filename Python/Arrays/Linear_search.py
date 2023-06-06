# Implementing Linear Search

# Input the array 
arr = []
size = int(input("Enter the size of the array: "))
for i in range(size):
    val = int(input("Enter the value: "))
    arr.append(val)

# Input the element to be found
n = int(input("Enter a element to be found: "))

# Creating a function for Linear Search
def LinearSearch(arr,n):
    for i in range(len(arr)):
        if(n==arr[i]):
            return i
    return -1

# Printing the element
result = LinearSearch(arr,n)
if(result==-1):
    print("Element not found")
else:
    print("Element found at position", i)