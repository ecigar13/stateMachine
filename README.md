
# stateMachine

Calculator class:
  - input(c)
  - T=0
  - n=0
  - changeState(c,this)
  
Subclass the State class.
Each state is a singleton.

S0:
 - getInstance()
 - changeState(c, this)
   - if(c == 0-9)
	   - update(c)
	   - updateCurrentState(s1, s1.getInstance)
   
S1:
  - if(c == 0-9)
	  - updateCurrentState(s2, s2.getInstance)
  - if(+)
	  - update T
  - if(-)
	  - do something.
  
S2, S3...
   
Do calculation in the calculator object. Do state transition in state machine. Separate them.
First, get input: input(c)
Current state: getInstance()
Change state: changeState(c, this)

