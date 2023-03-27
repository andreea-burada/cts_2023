## Clean Code

`DIP` (Dependency Inversion Principle) -> `DI` (dependency injection)
- DIP -> principle
- DI -> technique, the implementation of DIP
	- IOC - inversion of control container
- to implement DIP, we depend on interfaces instead of references to classes
- DIP helps avoid `tight-coupling` between classes and promotes `loose-coupling`

- ***DI***: linking the interface with your class
	- uses two techniques to initialize the interface attribute: 
		- **constructor injection**: using the constructor of the class to assign the interface attribte
		- **setter injection**: using the setter of the interface attribute to assign its value
	- !!! validate the interface attribute before using it to make sure its initialized and not `null`

- ***IOC***: a class that is created when the application starts that creates all necessary modules and places them in a hash map to be easily accessible; a manager of module references

- delegating an action to another class (calling a friend) -> `callback`

---

## Design Patterns

### Creational Design Patterns
- refer to the creation of objects
- two types of **instantiation**: `eager` and `lazy` -> it relates to `performance`a

#### Singleton 
> Problem: Ensure a class only has one instance and provide a global point of access to it
- **keywords**: `single`, `unique`, `only one`
- always check if resources are sensitive to the number of connections they can accept
- **disadvantage**: once an object was created it cannot be changed

#### Singleton Registry
- for handling multiple instances that need to exist *only once*
- can be implemented by:
	- `public static CLASS HashMap<key, CLASS> collectionOfClasses`
	- `enum` (Java)

#### Factory
> Problem: Define an interface for creating an object, but let subclasses decide which class to instantiate. 
> Lets a class defer instantiation to subclasses.
- **keywords**: `many details`
- `Simple Factory`: one single factory that handles all classes
	- params: `ClassType type, common params`
		- to pass the class type: `reflection` or `enum`