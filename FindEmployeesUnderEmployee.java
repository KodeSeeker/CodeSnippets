/**
Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.

{ "A", "C" },
{ "B", "C" },
{ "C", "F" },
{ "D", "E" },
{ "E", "F" },
{ "F", "F" } 

In this example C is manager of A, 
C is also manager of B, F is manager 
of C and so on.

Write a function to get no of employees under each manager in the hierarchy not just their direct reports. It may be assumed that an employee directly reports to only one manager. In the above dictionary the root node/ceo is listed as reporting to himself.

Output should be a Dictionary that contains following.

A - 0  
B - 0
C - 2
D - 0
E - 1
F - 5

Approach: 
1) Convert the mapping from EMp Manager to Manager -> List of Employees.
2) Iterate through original map and use the EmpManager map as a look up to create the required mapping. 
***/


Map<Employee,Integer> getReports(Map<Employee,Employee> map) {

	if( map == null) 
		return null;
	//create Manager- Emp Mapping.

	Map<Employee,List<Employee>> manEmpMap = new HashMap<Employee,List<Employee>();
		
	for(Map.Entry<Employee,Employee> entry: map.entrySet()) { 
		//if this manager has been looked at?
		if (manEmpMap.containsKey(entry.getValue())){
			manEmp.get(entry.getValue()).add(entry.getKey());
		}
		else{// if not create new entry.
			List<Employee> list = new ArrayList<Employee>();
			list.add(entry.getKey());
			manEmpMap.put(entry.getValue(),list);
		}
	}
			
// C->A,B
//F-> C,E,F
//E-D
//A->""
//B-> ""




// Iterate the original list again.
//recursively count the reports to a person and create the map .


List<Employee> list = map.keySet(); // list of all employees.

Map<Employee,Integer> reports= new HashMap<Employee, Integer>();

for (Employee e: list) {// create map using the utility function. 
	
	int count = populateReports(e,0);// initial call to util;

	reports.put(e,count);
}

	return reports;
}



/**
Utility method to recursively count the reports under a given employee.
V1- uses recursion . Needs to be memoized to avoid repeated lookups.
**/


int populateReports(Map<Employee,List<Employee> manEmpMap, Employee emp, int count){
	
	List<Employee> reportees = manEmp.get(emp);
	if( emp == null ||reportees.size() == 0)
		return 0;
	else {
		for( Employee e: reportees) {
			count++;
			count+ = populateReports(manEmpMap,e,count);// recursively compute for all children.
		}
		return count;
	}
}

		

}


