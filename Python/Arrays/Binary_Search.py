# Implementing Binary Search

# Binary search has the primary condition of the array to be sorted

# Input the sorted array 
arr = []
size = int(input("Enter the size of the array: "))
for i in range(size):
    val = int(input("Enter the value: "))
    arr.append(val)

# Input the element to be found
n = int(input("Enter a element to be found: "))

# Creating a function for Binary Search
def BinarySearch(arr,n):
    l = 0
    r = len(arr) - 1
    while(l<=r):
        mid = len(arr)//2
        if(arr[mid]<n):
            l = mid + 1
        elif(arr[mid]>n):
            r = mid - 1
        else:
            return mid
    return -1

# Printing the element
result = BinarySearch(arr,n)
if(result==-1):
    print("Element not found")
else:
    print("Element found at index", result)

