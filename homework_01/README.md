Checklist items are from: https://dzone.com/articles/java-code-review-checklist

---
## Phase 1
### Clean Code
#### Formatting:
- make sure the code formatting is applied
#### Meaningful Names:
- use intention-revealing names
### Security

### General
#### General Programming
- adhere to generally accepted naming conventions (mixed camel case)
- always override toString
- always override equals and hashCode when overriding equals
#### Classes and Interfaces
- in public classes, use accessor methods not public fields
#### Enums and Annotations
- use ENUM instead of constant variables

### Additional changes:
- the method `print()` was removed because it had no usages, and it was redundant since `toString()` is implemented
- in `calculate()`, `for each` was used instead of the generic `for` structure
