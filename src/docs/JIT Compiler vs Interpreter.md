JIT Compiler vs Interpreter:
Java uses both an Interpreter and a Just-In-Time (JIT) Compiler to provide a balance between startup speed and runtime performance:

1.Interpreter
Reads and executes bytecode instruction-by-instruction
Starts quickly
Slower for long-running operations due to repeated interpretation

2.JIT Compiler (Just-In-Time)
Identifies frequently executed bytecode (hotspots)
Converts them to optimized native machine code
Improves overall performance significantly

-->Why both?
Interpreter → fast startup
JIT → long-term performance improvement
Together, they make Java both fast and efficient.
