### Purpose
Encapsulates a request allowing it to be treated as an object.
This allows the request to be handled in traditionally object
based relationships such as queuing and callbacks.
### Use When
- You need callback functionality.
- Requests need to be handled at variant times or in variant orders.
- A history of requests is needed.
- The invoker should be decoupled from the object handling the
invocation.
###Example
Job queues are widely used to facilitate the asynchronous
processing of algorithms. By utilizing the command pattern the
functionality to be executed can be given to a job queue for
processing without any need for the queue to have knowledge
of the actual implementation it is invoking. The command object
that is enqueued implements its particular algorithm within the
confines of the interface the queue is expecting.