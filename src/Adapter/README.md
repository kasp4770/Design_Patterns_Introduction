### Purpose
Permits classes with disparate interfaces to work together by
creating a common object by which they may communicate
and interact.
### Use When
- A class to be used doesn’t meet interface requirements.
- Complex conditions tie object behavior to its state.
- Transitions between states need to be explicit.
### Example
A billing application needs to interface with an HR application in
order to exchange employee data, however each has its own interface
and implementation for the Employee object. In addition, the
SSN is stored in different formats by each system. By creating an
adapter we can create a common interface between the two applications
that allows them to communicate using their native objects
and is able to transform the SSN format in the process.