# Creating a 2-Dimentional array

matrix = []
row = int(input("Enter the number of rows: "))
col = int(input("Enter the number of columns: "))
for i in  range(row):
    arr = []
    for j in range(col):
        val = int(input("Enter the value: "))
        arr.append(val)
    matrix.append(arr)

# Printing the 2-Dimentional Matrix

for i in range(row):
    for j in range(col):
        print(matrix[i][j],end='  ')
    print()
        