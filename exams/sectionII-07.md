3. This question involves the implementation of a Travel Planner system that is represented by the Travelplan and Tour classes. A client will create Tour objects that will represent tours or activities of interest. Each tour object is made up of an activity date, start time, end time, and name of the activity- The client will also create a Travelplan object comprised of a destination and an arraylist of Tours. You will write three methods of the TravelPlan class. 

A partial declaration of the Tour class is shown below. 
```java
public class Tour {
	private int actDate;// date is in mwddyyyy format 
	private int startTime; // times are represented in military format 
	private int endTime; // 1430 for 2:30 pm
	private String activity; 
	
	/** constructs a Tour 
	 * All instance fields are initialized 
	 */
	Tour (int actDate, int startTime, int endTime, String activity) 
	{
		// implementation not shown 
	}
	public int getActDate()	{ return actDate; } 
	public int getStartTime () { return startTime;} 
	public int getEndTime (){ return endTime; } 
	public String getActivity(){ return activity;} 
}
```
A partial declaration of the TravelPlan class is shown below. 
```java
import java.util.ArrayList;

public class TravelPlan {
	private String destination; 
	private ArrayList <Tour> plans; 
	
	/** Constructs a Tour 
	 * Instance fields : destination and plans are initialized 
	 */
	TravelPlan (String destination) 
	{
		/* to be implemented in part (a)	*/ 
	}
	/** Returns true if the timeframe in t overlaps with another Tour in plans;
	 * otherwise false
	 */
	public boolean checkForConflicts (Tour t) 
	{
		/* to be implemented in part(b) */ 
	}
	
	/** Must call checkForConflicts for full credit, if checkForConflicts returns false
	 * (the timeframe does not overlap), adds t to plans. Returns true if
	 * t was added, otherwise returns false 
	 */
	public boolean addTour(Tour t) 
	{
		/* to be implemented in part(c) */ 
	}
}
```
The following table contains sample code and the expected results. 

Statements and Expressions |Value Returned (blank if no value)|Comment 
|---|---|---|
TravelPlan p1 = new TravelPlan("Capetown"); ||Creates an instance with a destination | "CapeTown” and an empty arraylist of type Tour
Tours t1 = new Tours (12132020,800,1230,"Bungee jumping");||Create a Tour instance with date, start time, end time, and activity
Tours t2 = new Tours (12132020,900,1430,"Body surfing");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t1) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 
p1.addTour(t2) |false|Checks for conflicts in plans, since there is conflicts, returns true 
Tours t3 = new Tours(12132020,1400,1700,"Shark cage diving");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t3) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 
Tours t4 = new Tours (1222020,800,1700,"Deep sea fishing");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t4) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 


(a) Write the TravelPlan constructor. 

**Class information for this question**

```java
public class Tour 
private int act Date
private int startTime 
private int endTime 
private string activity 

Tour (int actDate,int startTime, int endTime, String activity)
public int getActDate() 
public int getStartTime()
public int getEndTime() 
public String getActivity() 

public class TravelPlan
private String destination;  
private Arrayliist<Tour> plans; 

public TravelPlan (String destination) 
public boolean checkForConflicts(Tour t) 
public boolean addTour(Tourt t) 
```

(b) Write the TravelPlan checkForConflicts method. 

(c) Write the TravelPlan addTour method.

