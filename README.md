# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	1. A List of Dog objects: "dogs"
	2. Dog named Fido with 4 legs
	3. Dog named Fido with 3 legs
	4. Dog named Alfie with 4 legs
	5. A Comparator

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

- The comparator constructor is called when we say Collections.sort(dogs, new Comparator<Animal>()... The Comparator interface is defined in java.util package-- import java.util.Comparator;
