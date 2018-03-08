### Purpose
Allows loose coupling by encapsulating the way disparate sets of
objects interact and communicate with each other. Allows for the
actions of each object set to vary independently of one another.
### Use When
- Communication between sets of objects is well defined
and complex.
- Too many relationships exist and common point of control
or communication is needed.
### Example
Mailing list software keeps track of who is signed up to the
mailing list and provides a single point of access through which
any one person can communicate with the entire list. Without
a mediator implementation a person wanting to send a message
to the group would have to constantly keep track of who
was signed up and who was not. By implementing the mediator
pattern the system is able to receive messages from any point
then determine which recipients to forward the message on to,
without the sender of the message having to be concerned with
the actual recipient list.