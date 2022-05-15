class Person:
    def __init__(self, firstName, lastName, age):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age
    
    def details(self):
        return self.firstName + " " + self.lastName + ", Age: " + str(self.age)

    def person(self):
        print("Person Class")

class Student(Person):
    def __init__(self, firstName, lastName, age, id, degree):
        super().__init__(firstName, lastName, age)
        self.id = id
        self.degree = degree
    
    def studentDetails(self):
        super().person()
        print("Here: ", super().details())
        return "id: " + self.id + " degree: " + self.degree


student01 = Student("James", "Zhu", 15, "z5256987", "Commerce")
print(student01.details())
print(student01.studentDetails())

university = []
university.append(student01)
university.append(Student("Michael", "James", 22, "z2313123", "Computer Science"))
university.append(Student("Jenny", "Kim", 21, "z32322211", "Economics/Commerce"))

for student in university:
    student.person()
    print(student.studentDetails())

# ---------- Modifying Object Properties ---------- #
# You can modify properties on objects like this:
# Set the age of p1 to 40:
student01.age = 40
print(student01.studentDetails())

# ---------- Delete Object Properties ---------- #
# You can delete properties on objects by using the del keyword:
# Delete the age property from the p1 object:
del student01.age
print(student01.studentDetails())


# ---------- Delete Objects ---------- #
# You can delete objects by using the del keyword:
# Delete the p1 object:
del student01
