# Problem - Given an array of integers of size ‘n’ find the maximum sum of ‘k’ consecutive elements in the array.

# Input an array
arr = []
size = int(input("Enter the size of an array: "))
for i in range(size):
    val = int(input("Enter the value: "))
    arr.append(val)

# Enter the value of elements to be added
k = int(input("Enter the elements to be sumed up: "))

# sum of 'k' consecutive elements

def MaxSum(arr,k):
    l = []
    for i in range(0,len(arr)-k+1):
        beg = i
        end = beg+k
        sub_arr = arr[beg:end]
        l.append(sum(sub_arr))
    max_arr = max(l)
    return max_arr
   
result = MaxSum(arr,k)
print(result)