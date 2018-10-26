from numpy import *

arr1 =array([
    [1,2,3,4,5,6],
    [8,7,4,5,6,1]
])

print(arr1)
print(arr1.dtype)
print(arr1.ndim)
print(arr1.shape)
print(arr1.size)

print(arr1.flatten())
print(arr1.reshape(3,4))
print()
print(arr1.reshape(2,2,3))

m = matrix('1,2,3 ; 4,5,6')
print(m)

# matrix addition
m1 = matrix('1,2,3 ; 4,5,6 ; 7,8,9')
m2 = matrix('1,2,7 ; 6,8,9 ; 2,3,1')

m3 = m1 + m2
m4 = m1 * m2

print(m3)
print(m4)