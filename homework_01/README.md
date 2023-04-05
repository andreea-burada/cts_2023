Checklist items are from: https://dzone.com/articles/java-code-review-checklist

---
## Phase 1
### Clean Code
#### Formatting:
- make sure the code formatting is applied

#### Meaningful Names:
- use intention-revealing names

### Security
#### Fundamentals:
- make class final if not being used for inheritance

#### Input Validation:
- validate inputs (validations in setters and constructor)

#### Mutability:
- make public static fields final (to avoid caller changing the value)

### General
#### General Programming:
- adhere to generally accepted naming conventions (mixed camel case)
- always override toString
- always override equals and hashCode when overriding equals

#### Classes and Interfaces:
- in public classes, use accessor methods not public fields

#### Enums and Annotations:
- use ENUM instead of constant variables (`AccountType`)

### Additional changes:
- the method `print()` was removed because it had no usages, and it was redundant since `toString()` is implemented
- in `calculate(...)`, `for each` was used instead of the generic `for` structure
- in the `constructor` a parameter for `daysActive` has been added; otherwise all accounts have `daysActive=0` which results in `calculate()` always returning 0
- `calculate(...)` -> `calculateTotalBrokerageFee(...)`
- generated all `getters` and `setters`

---
## Phase 2
### Clean Code
#### Functions
- functions should be small
- do one thing (*Single Responsibility* from **SOLID**): split the `calculate` function into smaller functions that respect **KISS**. See below

### Additional changes:
- `calculateTotalBrokerageFee(...)` -> `CalculateTotalBrokerageFee(...)`
- created class `IAccount` that has a method `getMonthlyRate`. 
All future Account related classes will implement `IAccount` interface and the method will become mandatory for all implementations
- added method `IsObligedToPayBrokerFee` which returns a boolean based on whether an account has to pay the broker fee (account of type `PREMIUM` or `SUPER_PREMIUM`)
- added method `GetNumberOfPeriods` that returns the number of periods the account has been active for. Static variable `PERIODS` renamed to `PERIOD_LENGTH`.
- added method `GetCumulativeInterestRate` which returns `interestRate ^ numberOfPeriods`
- added method `GetInterestRateMinusPrincipal` which returns `interest - principal`

## Phase 3
### General
#### General Programming
- refer to objects by their interface (in `TestMain`)

### Additional changes:
- the `getMonthlyRate` is part of the `Account` functionality and it was left in the `IAccount` interface
- remove external dependencies based on `DIP` (created a `IBroker` interface that is given to the method `CalculateTotalBrokerageFee(...)` as a parameter)
- all the business logic related to calculating the brokerage fee have been moved into `Broker` which implements `IBroker`
