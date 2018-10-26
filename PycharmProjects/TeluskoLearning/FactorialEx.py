def fact(n):

    count=1
    for i in range(1,n+1):
        count = count*i
    return count

num = int(input("Enter the number: "))

result = fact(num)
print("The factorial is: {}".format(result))