### Purpose
Facilitates the creation of object hierarchies where each object
can be treated independently or as a set of nested objects
through the same interface.
### Use When
- Hierarchical representations of objects are needed..
- Objects and compositions of objects should be treated uniformly.
### Example
Sometimes the information displayed in a shopping cart is the
product of a single item while other times it is an aggregation
of multiple items. By implementing items as composites we can
treat the aggregates and the items in the same way, allowing us
to simply iterate over the tree and invoke functionality on each
item. By calling the getCost() method on any given node we
would get the cost of that item plus the cost of all child items,
allowing items to be uniformly treated whether they were single
items or groups of items.