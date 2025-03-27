


package whats.webapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sendwishes {

    // Method 1: Group → (Date → Birthday Message)
    public Map<String, Map<String, String>> getBirthdayMessagesByGroup() {
        Map<String, Map<String, String>> groupBirthdayMap = new HashMap<>();

        // 🎉 Kadapa Buddies
        Map<String, String> kadapaMap = new HashMap<>();
        kadapaMap.put("01-10", "Happy birthday to you Mr. Nagaraju Valasa");
        kadapaMap.put("02-04", "Happy birthday to you Mr. Srinivasulu Penumadu");
        kadapaMap.put("26-04", "Happy birthday to you Mr. Nagendra Kumar Adapala");
        kadapaMap.put("30-04", "Happy birthday to you Mr. Vidya Sagar Pasupuleti");
        kadapaMap.put("24-06", "Happy birthday to you Mr. Harish Kumar Kalisetty");
        kadapaMap.put("09-09", "Happy birthday to you Mr. Sreenivasulu Bandi");
        kadapaMap.put("13-09", "Happy birthday to you Mr. Sreekanth Chennakesavula");
        groupBirthdayMap.put("Kadapa Buddies", kadapaMap);

        // 🎉 bloreMap Team
        Map<String, String> bloreMap = new HashMap<>();
        bloreMap.put("26-04", "Happy birthday to you Mr. Nagendra Kumar Adapala");
        bloreMap.put("24-06", "Happy birthday to you Mr. Harish Kumar Kalisetty");
        bloreMap.put("13-09", "Happy birthday to you Mr. Sreekanth Chennakesavula");
        groupBirthdayMap.put("Youth 90's Batch", bloreMap);
        
        
        //Home Map
        Map<String, String> homeMap = new HashMap<>();
        homeMap.put("26-04", "Happy birthday to you Mr. Nagendra Kumar Adapala");
        homeMap.put("24-08", "Happy birthday to you Mrs. Anjani Surekha Pothula");
        homeMap.put("12-08", "Happy birthday to you Mr. Venkata Maruthi Sowmyanath Adapala");
        homeMap.put("07-05", "Happy birthday to you Miss. Kiranmayi Rajeshwari Adapala");
        groupBirthdayMap.put("RASNA", homeMap);

        return groupBirthdayMap;
    }

    // Method 2: Group name → Country
    public Map<String, String> getGroupList() {
        Map<String, String> groupMap = new LinkedHashMap<>();
        groupMap.put("Kadapa Buddies", "CAN");
		groupMap.put("Gundachari school SSC92", "IND");
		groupMap.put("RASNA", "CAN");
		groupMap.put("Youth 90's Batch", "IND");
        return groupMap;
    }

    // Method 3: Decision logic
    public String getMessageForGroup(String groupName, String country) {
        String today = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Map<String, Map<String, String>> birthdayMessagesByGroup = getBirthdayMessagesByGroup();

        // Check if this group has birthday messages
        if (birthdayMessagesByGroup.containsKey(groupName)) {
            Map<String, String> groupBirthdays = birthdayMessagesByGroup.get(groupName);
            if (groupBirthdays.containsKey(today)) {
                return groupBirthdays.get(today); // 🎂 Send birthday message for today
            }
        }

        // 🎯 No birthday today for this group → return default by country
        if ("IND".equalsIgnoreCase(country)) {
            return "Good Evening All Friends";
        } else {
            return "Hi, All Good morning friends";
        }
    }
}

/* second code, tested but not complete
package whats.webapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sendwishes {

	// Method 1: Birthday messages mapped by date
	public Map<String, String> getBirthdayMessages() {
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("21-03", "Hi Friends, the automation code is working, but Needs to scan QR before running this code");
		dateMap.put("01-10", "Happy birthday to you Mr. Nagaraju Valasa");
		dateMap.put("02-04", "Happy birthday to you Mr. Srinivasulu Penumadu");
		dateMap.put("26-04", "Happy birthday to you Mr. Nagendra Kumar Adapala");
		dateMap.put("30-04", "Happy birthday to you Mr. Vidya Sagar Pasupuleti");
		dateMap.put("24-06", "Happy birthday to you Mr. Harish Kumar Kalisetty");
		dateMap.put("09-09", "Happy birthday to you Mr. Sreenivasulu Bandi");
		dateMap.put("13-09", "Happy birthday to you Mr. Sreekanth Chennakesavula");
		
		
		return dateMap;
	}

	// Method 2: Group name to country
	public Map<String, String> getGroupList() {
		Map<String, String> groupMap = new LinkedHashMap<>(); // Preserves insertion order
		groupMap.put("Kadapa Buddies", "CAN");
		groupMap.put("Gundachari school SSC92", "IND");
		groupMap.put("RASNA", "USA");
		groupMap.put("Youth 90's Batch", "IND");
		return groupMap;
	}

	// Method 3: Logic to decide message
	public String getMessageForGroup(String country) {
		if ("IND".equalsIgnoreCase(country)) {
			return "Good Night !!! All Friends";
		}

		// Check for date-specific birthday messages
		String today = new SimpleDateFormat("dd-MM").format(new Date());
		Map<String, String> birthdayMessages = getBirthdayMessages();
		return birthdayMessages.getOrDefault(today, "Hi, All Good afternoon friends");
	}
}

*/

/* 
 
 //working first poc
package whats.webapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Sendwishes {
	public String WishingFriends () {
		
		  Map<String, String> dateMap = new HashMap<>();
		    dateMap.put("23-03-2025", "Hi Friends, Good evening all");
	        dateMap.put("02-04-2025", "Happy birthday to you Mr. Srinivasulu Penumadu");
	        dateMap.put("26-04-2025", "Happy birthday to you Mr. Nagendra Adapala");
	        dateMap.put("30-04-2025", "Happy birthday to you Mr. Vidya Pasupuleti");
	        dateMap.put("13-09-2025", "Happy birthday to you Mr. Sreekanth Chennakesavula");
	        dateMap.put("24-06-2025", "Happy birthday to you Mr. Harish Kalisetty");
	        dateMap.put("09-09-2025", "Happy birthday to you Mr. Sreenivasulu Bandi");
	        dateMap.put("01-10-2025", "Happy birthday to you Mr. Nagaraju Valasa");
	        
	        String today = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

	        // Check if the key exists in the map and return its value
	        if (dateMap.containsKey(today)) 
	            return dateMap.get(today);
	        else
		       return "Hi, All Good morning friends";
	}

}*/
