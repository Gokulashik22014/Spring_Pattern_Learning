    interface
|      |        |
class1 class2 class3

now can use 
InterfaceName name = new Class1() or 2() or 3()

but even though this is efficeint using new keyword is not lets say we change then it causes confusion to avoid this we go for Factory design

so instead of this we use a method

InterfaceName name=getClass(option)

now getClass() based on option going to return class 1 or 2 or 3
now this can further be enhancd with enum 