Pattern used: Factory Method

Advantages:
    - Avoid tight coupling between the creator and the concrete products
    - Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support
    - Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code
    - All created objects have a common interface

Disadvantages:
    - The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern
    - Produces lots of generic code which results in less understandable code
    - Subclassing is fine when the client has to subclass the creator class anyway, but otherwise, the client now must deal with another point of evolution
