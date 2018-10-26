class Student:
    def __init__(self,name,rollno):
        self.name = name
        self.rollno = rollno
        self.lap = self.Laptop()

    def show(self):
        print(self.name,self.rollno)
        self.lap.show()


    class Laptop:
        def __init__(self):
            self.brand = 'HP'

        def show(self):
            print(self.brand)


s1 = Student("Roshan",20)
s2 = Student("Hari",30)

s1.show()