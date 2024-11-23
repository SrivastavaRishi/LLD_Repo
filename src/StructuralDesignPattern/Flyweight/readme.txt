Helps in reducing RAM size being used
Kind of optimisation pattern

Qst: 
1. Design word processor.
2. Desing Ball game.


Eg: Human Robot, Dog Robot

class attributes -> {x cordinate, y cordinate, sprite datatype(bitmap)}

When to use ? 
1. Memory is limited.
2. Object share data.
    a. Intrinsic data: common data(sprite) 
    b. Extrinsic data: changed based on client input (eg: X, Y)
3. Creation of new object is expensive.


How to solve ?
1. From class, remove extrinsic data and keep Intrinsic data (Flyweight Object)
2. Flyweight class is mostly immutable.
3. Extrinsic data can be passed into Flyweight class in method parameter.
4. Once Flyweight object is created, it is cached and used for future reference.

