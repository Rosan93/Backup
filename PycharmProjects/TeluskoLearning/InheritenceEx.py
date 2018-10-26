class A:
    def feature1(self):
        print("Feature A coming soon")

class B:
    def feature2(self):
        print("Feature B coming soon")

class C(B,A):
    def feature3(self):
        print("Feature C coming soon")


# a1 = A()
# a1.feature1()

b1 = C()
b1.feature1()
b1.feature2()
b1.feature3()
