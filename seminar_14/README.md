## J-Unit Testing
### C.O.R.R.E.C.T.

- `C` - `Conformance` → Is the input valid?
- `O` - `Ordering*` → Is the order of the values important?
- `R` - `Reference` → Check the references. (null or valid reference)
- `R` - `Range` → Check all possible values from the data range.
- `E` - `Existence` → Check if the value exists
- `C` - `Cardinality*` → Is the number of values in the collection important?
- `T` - `Time` → Is the time of execution important?

`*` → specific to collections

## Right - B.I.C.E.P.
- `Right` → Do you get the right results for the right input?
- `B` → `Boundary` → Test your limits and the value near them.
- `I` → `Inverse relation` → Test the opposite and demonstrate that it will not happen.
- `C` → `Cross-Checking` → Ask a friend / Test the results a different way.
- `E` → `Error` → Test for error conditions.
- `P` → `Performance` → Is the time of execution important?
