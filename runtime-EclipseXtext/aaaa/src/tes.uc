UC 22: Register Loss
PRECONDITION: Cleark (user) already logged
POSTCONDITION: Nothing happens

MAIN FLOW:
	1. USER enters insureds policy number or else name and date of incident. 
	2. SYSTEM populatesavailable policy information and indicates claim is matched to policy.
	3. USER enters basic loss information
	4. SYSTEM confirms there are no existing, possiblycompeting claims and assigns a claim number
	5. USER continues entering loss information specific to claim line.
	6. USER as System pull other coverage information from other computer systems
	7. USER selects and assigns an adjuster
	8. USER confirms they are finished
	9. SYSTEM saves and triggers acknowledgement be sent to agent``
	10. WHILE CondA AND condB OR COndC
		10.1. USER Do A
		10.2. WHILE COnd
			10.2.1. SYSTEM Do B

ALTERNATIVE FLOW:
	1.a. IF Found policy information does not match the insureds information
		1. Clerk enters correct policy number or insured name and asks System topopulate with new policy index information.
		2. RETURN TO 2
	
	1.b. IF Using search details, System could not find a policy:
		1. RETURN TO 1 
	
	1.c. IF Clerk changed policy number, date of loss or claim line after initial policy match
		1. System validates changes, populates loss with correct policy information,validates and indicates claim is matched to policy
		2. System warns Clerk to re-evaluate coverage
		3. UC END
	1.c.1.a. IF System cannot validate policy match:
		1. System warns Clerk.
		2. Clerk Finds the policy using the search details for policy
		3. RETURN TO 1.c.2

UC 23: Case
MAIN FLOW:
	1. USER DO a
	2. INCLUDE Register Loss
		
