# lamda function
# f = lambda a:a*a
#
# result =f(5)
# print(result)
#
# x = lambda c,d:c+d
# m = int(input("Enter first number: "))
# n = int(input("Enter second number: "))
# result2 = x(m,n)
# print(result2)


from functools import reduce

# filter,map,reduce
lst = [1,2,3,4,5,6,7,8,9,10]

# filter
result = list(filter(lambda n:n%2==0,lst))

# map
doubles = list(map(lambda n:n*2,result))

# reduce
result2 = reduce(lambda a,b:a+b,doubles)


print(result)
print(doubles)
print(result2)




