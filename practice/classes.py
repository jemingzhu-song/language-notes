class Student:
    def __init__(self, id, firstName, lastName, degree):
        self.id = id
        self.firstName = firstName
        self.lastName = lastName
        self.degree = degree
    
    def getName(self):
        return self.firstName + " " + self.lastName

    def getDegree(self):
        return self.degree

    def getProfile(self):
        return str(self.id) + ": " + self.getName() + " " + self.getDegree()

student01 = Student(1, "Michael", "Ge", "Commerce")
print(student01.getProfile())

student01.firstName = "James"
print(student01.getProfile())

del student01.firstName
del student01
print(student01)