import array as arr

# Integer array
# vals =arr.array('i',[5,6,7,8])
# print(vals)
#
# for e in range(len(vals)):
#     print(vals[e])
#
# #Character arrays
# vals1 =arr.array('u',['a','e','i','o','u'])
#
# for e in range(len(vals1)):
#     print(vals1[e])
#
# #Unknownn datatype array
# newArr = arr.array(vals.typecode,(a for a in vals))
# for e in newArr:
#     print(e)

n= int(input("Enter the length of array: "))
vals4 = arr.array('i',[])

for i in range(n):
    a = int(input("Enter the item: "))
    vals4.append(a)

print(vals4)

b= int(input("Enter the item to be searched: "))
y=0

for z in vals4:
    if z==b:
        print(y)
        break

    y+=1




