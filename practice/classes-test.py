class Person:
    def __init__(self, firstName, lastName, age):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age
    
    def personDetails(self):
        return self.firstName + " " + self.lastName + ", Age: " + str(self.age)
    
class Student(Person):
    def __init__(self, firstName, lastName, age, id, degree):
        super().__init__(firstName, lastName, age)
        self.id = id
        self.degree = degree
    
    def studentDetails(self):
        return super().personDetails() + ", ID: " + self.id + ", Degree: " + self.degree
    
class Tutor(Person):
    def __init__(self, firstName, lastName, age, course, status):
        super().__init__(firstName, lastName, age)
        self.course = course
        self.status = status

    def tutorDetails(self):
        return super().personDetails() + ", Course: " + self.course + ", Status: " + self.status


s1 = Student("James", "Gu", 21, "z5251234", "Commerce")
s2 = Student("Michael", "Kim", 23, "z2314441", "Computer Science")
s3 = Student("Milly", "Wu", 21, "z2313331", "Science")

t1 = Tutor("Jimmy", "Chen", 25, "COMP2313", "Tutor")

students = [s1, 6, s2, s3, t1, 5]

for elem in students:
    if isinstance(elem, (Person, Student, Tutor)):
        if isinstance(elem, Student):
            print(elem.studentDetails())
        if isinstance(elem, Tutor):
            print(elem.tutorDetails())
