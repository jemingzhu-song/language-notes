# ---------- Code Modularization ---------- #
# One of the guiding principles for good coding is the principle of code modularization.

# ---------- Assembling Complex Code ---------- #
# When building a piece of complex machinery, such as a car, you do not start by piecing 
# together the individual components (nuts, bolts, gears, etc) hoping to build the complex 
# item directly from scratch. Instead you break the task into constructing (conceptually) 
# simpler components: the engine, gearbox, electrics, etc - with each component being 
# responsible for a simple task (relative to the overall behaviour). Constructing these 
# "simpler" components may themselves require further refinement, adding an additional layer 
# of simplification; and this process of breaking a complex task into simpler ones will carry 
# on down to the the level of individual components. Constructing the car is then essentially 
# the process of repeatedly taking components responsible for a simple task, and combining 
# them to perform a more complex task - albeit at differing levels of complexity.

# Well-written code follows a similar principle: code is broken up into small pieces 
# responsible for carrying out simple tasks; more complex code is constructed by combining 
# these code modules; and may themselves form the building blocks for yet more complex code.

# This approach has a number of benefits:

# • It simplifies the process of understanding how a piece of complex code works. This is critical for 
#   code maintenance:
#       ○ It makes it easier to identify sources of problems
#       ○ Problematic code can be readily repaired/replaced/removed/updated - just replace 
#         the problematic code module
#       ○ Non-problematic code can be identified and extracted to be used elsewhere
# • It promotes the principle of code reuse. A core concept of good programming is "don't 
#   repeat yourself" (also known as the DRY principle). Rather than "writing everything twice" 
#   (WET coding), the idea is to access a single piece of code from multiple locations. 
#   The advantages of this approach include:
#       ○ Fewer opportunities to introduce errors 
#       ○ It can highlight underlying connections between different parts of the program, helping to 
#         clarify the overall program design
#       ○ It makes it easier to update code - for example, if you learn of a different 
#         approach, you only need to change your code in one place.

# ---------- Functions, Objects, and Libraries ---------- #
# Python, like many other programming languages, offers several constructs for promoting code modularization. Three of 
# the most common approaches are through functions, objects, and libraries. This week's lesson will cover these topics
# in more detail. First we look at the role each of them play for developing good coding practices.

# ---------- Functions ---------- #
# Functions - also known in other programming languages as subroutines, procedures, or methods - are the simplest 
# form of code modularization. Functions allow you to group together a number of statements 
# and name the group for future use - very useful if you need to repeat (essentially) the same sequence 
# of instructions several times. Functions may or may not take arguments (inputs) which can modify the computation 
# performed by the function; and they may or may not return output. We have already seen a 
# number of built-in functions: print(), input(), len(), etc. This week we will cover how to define your own functions.

# As the simplest form of code modularization it is good practice to ensure that your functions 
# do not "do too much" - you should be able to describe what a function does in a simple 
# sentence; and, importantly, how the function does it in a few short sentences.

# ---------- Objects ---------- #
# Object-oriented programming has become one of the most popular approaches to software development. Rather than 
# viewing programs as sequences of instructions, the principle of Object-oriented program is that programs consist 
# of _objects_ (fundamental pieces of code) that interact with each other to achieve a larger goal. Objects encapsulate data 
# (through fields) and behaviour (through methods) at a foundational level. Because Python is built on the principles of 
# object-orientation, we have already seen and used a number of objects: we have simple objects like ints, floats, and booleans 
# that encapsulate data, but do not have intrinsic behaviour associated with them; and we have seen more complex objects like 
# strings, lists, and dicts that have both data and behaviour. Objects are the natural progression from functions to more modular 
# code as they encompass the process of bundling together several related functions. 

# We define objects through classes - an object is a single entity (or instance) of its class. For example, 42 is an instance of 
# the int class. Conceptually, objects correspond to concrete items (e.g. the computer you are currently working on) whereas 
# classes correspond to abstract collections (e.g. the concept of a "computer"). Technically, an object is a piece of memory 
# that is assigned at run-time, whereas a class is the code that defines it. In this week's lesson you will learn how to define 
# your own classes so that you can add user-defined objects to your code.

# A common issue when building object-oriented code is the level of complexity needed by objects for good code - too many 
# objects can obfuscate the overall picture, whereas too few can break the intended goals of code modularization. 
# Paradoxically, the more complex your code, the simpler your objects ought to be. Judgement on where the line needs to be 
# drawn comes with experience, though two good guiding practices are the KISS principle (i.e. don't do too much) and, for 
# the more experienced programmers, the SOLID principle.

# A second issue that arises quite frequently is at what level should object behaviour be implemented? Consider the two 
# built-in string-modifying functions: int() which converts a string to an int, and upper() - a string method that returns 
# an upper-case version of the string. In Python int() is a top-level function, whereas upper() is a method of the string class. 
# The designers of Python could have made upper() a top-level function, or have a string method named to_int(), however it was 
# decided that upper() was best considered a behaviour appropriate for string objects, whereas int() was best considered a 
# function acting on string objects - especially because it is also used as a function on other object types.

# ---------- Libraries ---------- #
# At its core, Python, like many other languages, is relatively simple. After this week we will have covered the vast majority of the 
# built-in commands available in the default Python language. It should be apparent, however, that Python is very powerful - the 
# default commands offer a lot of potential. This potential is unlocked through libraries - packages of auxiliary code. Libraries 
# are conceptually at the top-level of code modularization - standalone code designed to be imported into other programs to simplify 
# complex tasks. Libraries are usually built around a single, broad concept - for example 

# • The math library defines a number of mathematical functions; 
# • The random library provides tools (functions and objects) for generating random numbers; 
# • The pandas library provides tools for statistical analysis;
# • The numpy library provides tools for performing intensive numerical computations.

# Libraries simplify the problem of coding complex tasks through the principle of code reuse - for example, rather than having 
# to define your own sine function, the math library provides an implementation. They can also provide state-of-the-art 
# coding without the programmer having to know the finer details of niche areas. For example numpy provides a number of 
# functions suitable for high-performance numerical computation. Any improvements on these functions can be passed 
# along through an update to the numpy library, which should pass the improvement on to any program using the numpy 
# library functions without modification from the programmer (in theory).

# Libraries can be provided as part of the default installation (standard libraries), through third-parties, or even be 
# user-defined. The second half of this course will focus on several (third-party) libraries that provide useful tools 
# for Data Analysis.