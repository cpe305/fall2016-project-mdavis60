import java.io.File;
import java.nio.file.Path;
import java.util.Calendar;

public class EventObserver 
{
	public void storeEvent(Event anEvent)
	{
		
	}
	public Event getEvent(String name, Calendar date, File[] directory)
	{
		Event theEvent = null;
		File subDir, eventFile;
		
		while(theEvent == null)
		{
			//Finds year folder
			subDir = findFile(Integer.toString(date.YEAR), directory);
			if(subDir == null)	
				return theEvent;
			
			//Finds month folder
			subDir = findFile(Integer.toString(date.MONTH), subDir.listFiles());
			if(subDir == null)	
				return theEvent;
			
			//Finds week folder
			subDir = findFile(Integer.toString(date.WEEK_OF_MONTH), subDir.listFiles());
			if(subDir == null)	
				return theEvent;
			
			eventFile = findFile(name, subDir.listFiles());
			//Retrieve event from file?
		}
		
		
		return theEvent;
	}
	private File findFile(String dirName, File[] directory)
	{
		for(File sub : directory)
			if(dirName == sub.getName())
				return sub;
		System.out.println("Directory not found");
		return null;
	}
	
}
