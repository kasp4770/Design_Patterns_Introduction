### Purpose
Create objects based upon a template of an existing objects
through cloning.
### Use When
- Composition, creation, and representation of objects should
be decoupled from a system.
- Classes to be created are specified at runtime.
- A limited number of state combinations exist in an object.
- Objects or object structures are required that are identical or
closely resemble other existing objects or object structures.
- The initial creation of each object is an expensive operation.
### Example
Rates processing engines often require the lookup of many
different configuration values, making the initialization of the
engine a relatively expensive process. When multiple instances
of the engine is needed, say for importing data in a multi-threaded
manner, the expense of initializing many engines is high. By
utilizing the prototype pattern we can ensure that only a single
copy of the engine has to be initialized then simply clone the
engine to create a duplicate of the already initialized object.
The added benefit of this is that the clones can be streamlined
to only include relevant data for their situation.