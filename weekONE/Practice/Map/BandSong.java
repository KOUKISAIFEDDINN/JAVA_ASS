import java.util.HashMap;
import java.util.Map;

public class BandSong {
    public static void main(String[] args) {
        // Create a HashMap 
        Map<String, String> trackList = new HashMap<>();






        // Add songs to the List
        trackList.put("Bring Me To Life", "Call my name and save me from the dark...");
        trackList.put("Going Under", "Now I will tell you what I've done for you...");
        trackList.put("Hello", "Playground, school-bell rings, again");
        trackList.put("Lithium", "Lithium don't want to lock me up inside");





        // Pull a song 
        String songTitleToRetrieve = "Going Under";
        String lyrics = trackList.get(songTitleToRetrieve);
        System.out.println("Retrieving song with title '" + songTitleToRetrieve + "':");
        System.out.println("Track: " + songTitleToRetrieve + "\nLyrics: " + lyrics);
        System.out.println();




        // all names of track and lyrics
        System.out.println("All tracks and lyrics:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println("Track: " + entry.getKey() + "\nLyrics: " + entry.getValue() + "\n");
        }
    }
}