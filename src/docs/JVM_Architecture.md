1. JVM Architecture
The Java Virtual Machine (JVM) is the execution environment responsible for running Java applications. It provides platform independence by executing compiled Java bytecode rather than machine-specific instructions. The JVM architecture consists of three major components:

a. Class Loader Subsystem
Responsible for loading .class files into memory. It performs:
Loading – reads class files
Linking – verifies and prepares classes
Initialization – executes static initializers

b. Runtime Data Areas
These are memory areas used during execution:
Method Area – stores class-level information, constants, static variables
Heap – stores objects and instance variables
Java Stack – stores stack frames, method calls, local variables
PC Register – stores address of current instruction
Native Method Stack – executes native (non-Java) code

c Execution Engine
Executes the loaded bytecode:
Interpreter – executes bytecode line-by-line
JIT Compiler – optimizes by compiling hot code paths to native code
Garbage Collector – automatically cleans unused objects
The JVM architecture ensures efficient execution, memory management, and security.

