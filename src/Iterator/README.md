### Purpose
Allows for access to the elements of an aggregate object
without allowing access to its underlying representation.
### Use When
- Access to elements is needed without access to the entire
representation.
- Multiple or concurrent traversals of the elements are needed.
- A uniform interface for traversal is needed.
- Subtle differences exist between the implementation details
of various iterators.
### Example
The Java implementation of the iterator pattern allows users to
traverse various types of data sets without worrying about the
underlying implementation of the collection. Since clients simply
interact with the iterator interface, collections are left to define
the appropriate iterator for themselves. Some will allow full access
to the underlying data set while others may restrict certain
functionalities, such as removing items.