class A:
    def __init__(self):
        print("In A init")

    def feature1(self):
        print("Feature A coming soon")

class B(A):
    def __init__(self):
        print("In B init")

    def feature2(self):
        print("Feature B coming soon")

class C(B,A):
    def __init__(self):
        super().__init__()
        print("In C init")

    def feature3(self):
        print("Feature C coming soon")


# a1 = A()
# a1.feature1()

b1 = C()
# b1.feature1()
# b1.feature2()
# b1.feature3()
