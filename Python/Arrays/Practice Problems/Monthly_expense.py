''' Let us say your expense for every month are listed below,
January - 2200
February - 2350
March - 2600
April - 2130
May - 2190
Create a list to store these monthly expenses and using that find out,

1. In Feb, how many dollars you spent extra compare to January?
2. Find out your total expense in first quarter (first three months) of the year.
3. Find out if you spent exactly 2000 dollars in any month
4. June month just finished and your expense is 1980 dollar. Add this item to our monthly expense list
5. You returned an item that you bought in a month of April and
got a refund of 200$. Make a correction to your monthly expense list
based on this. '''

arr = [2200,2350,2600,2130,2190]

# 1

a1 = arr[1] - arr[0]
print(a1, "dollars were spent extra in February as compared to January.")

# 2

sum = 0
for i in range(3):
    sum = sum + arr[i]
print("Total expense in first quarter is", sum)

# 3

flag = False
for i in range(len(arr)):
    if(arr[i]==200):
        flag = True
    else:
        flag = False
if(flag == True):
    print(i)
else:
    print("200 not present")

# 4

arr.append(1980)
print("Expenses at the end of June:", arr)

# 5

arr.remove(2130)
a3 = 2130-200
arr.insert(3,a3)
print("Expenses after 200$ return in April:", arr)