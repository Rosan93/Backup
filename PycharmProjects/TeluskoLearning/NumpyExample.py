from numpy import *

# # creating array
#
# arr = array([1,2,3,4],float)
# print(arr.dtype)
# print(arr)
#
#
# # creating array using linespace
# arr =linspace(0,16,16)
# print(arr)
#
#
# # creating array using arange
# arr = arange(1,15,2)
# print(arr)
#
#
# # creating array using logspace
# arr = logspace(1,40,5)
# print(arr)
#
#
# # creating array using zeros
# arr = zeros(5,int)
# print(arr)
#
#
# # creating array using ones
# arr = ones(5,int)
# print(arr)

# # Copying an array
# arr1 = array([1,2,3,4,5])
# arr2 = array([6,7,8,9,10])
#
# arr3 =arr1+arr2
#
# print(arr3)
# print(concatenate([arr1,arr2]))

# Copying array
# Shallow Copy
arr1 = array([1,2,3,4,5])
arr2 =arr1.view()

arr1[1]=8

print(arr1)
print(arr2)

print(id(arr1))
print(id(arr2))
#
# print()
# Deep Copy
# arr1 = array([1,2,3,4,5])
# arr2 =arr1.copy()
#
# arr1[1]=8
#
# print(arr1)
# print(arr2)
#
# print(id(arr1))
# print(id(arr2))



