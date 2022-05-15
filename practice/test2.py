


from typing import Dict, List


p1 = {"Monday", "Wednesday", "Friday", "Sunday"}
p2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}

p1.discard("Monday")
p1.discard("Monday")
print(p1)

p1.add("Monday")
print(p1)

print("Monday" in p1)

print(p1.union(p2)) # {Monday - Friday, Sunday}
print(p1.intersection(p2)) # {Monday, Wednesday, Friday}
print(p1.difference(p2)) # {Sunday}
print(p2.difference(p1)) # {Tuesday, Thursday}

q = set()
q.add("Monday")
q.add("tuesday")
print(q)


def readList(l : List[int]) -> int:
    counter = 0
    for num in l:
        counter += 1
    return counter

def readDict(d : Dict) -> int:
    counter = 0
    for key, value in d.items():
        print(key, value)
        counter += 1
    return counter

test = [1,2,3,4,5,6,7,8]
print(readList(test))

test2 = {'A': [1,2], 'B': 5, 'C': ['a', 'b', 'c']}
print(readDict(test2))

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


def countStudents(l : List[Person]) -> int:
    counter = 0
    for p in l:
        if isinstance(p, Student) | isinstance(p, Tutor):
            counter += 1
    return counter

s1 = Student("James", "Gu", 21, "z5251234", "Commerce")
s2 = Student("Michael", "Kim", 23, "z2314441", "Computer Science")
s3 = Student("Milly", "Wu", 21, "z2313331", "Science")
t1 = Tutor("Jimmy", "Chen", 25, "COMP2313", "Tutor")
university = [s1, s2, s3, t1]

print(countStudents(university))

