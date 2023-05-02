import java.util.*;

interface SongComponent
{
    public void displaySongInfo();
    public void displaySongDuration();
    public void displaySongSize();
}

class Song implements SongComponent
{
    String artist;
    int size;
    int duration;

    Song(String artist, int size, int duration)
    {
        this.artist = artist;
        this.size = size;
        this.duration = duration;
    }

    public void displaySongInfo()
    {
        System.out.println("Artist: " + this.artist);
        System.out.println("Duration: " + this.duration);
        System.out.println("Size: " + this.size);
    }

    public void displaySongDuration()
    {
        System.out.println("Duration: " + this.duration);
    }

    public void displaySongSize()
    {
        System.out.println("Size: " + this.size);
    }
}

class SongAlbum implements SongComponent
{
    private ArrayList<SongComponent> songComponents = new ArrayList<>();
    private String componentName;

    SongAlbum(String name)
    {
        this.componentName = name;
    }

    public void add(SongComponent component)
    {
        songComponents.add(component);
    }

    public void remove(SongComponent component)
    {
        songComponents.remove(component);
    }

    public void displaySongInfo()
    {
        System.out.println("Album Name: " + this.componentName);

        for(SongComponent component: songComponents)
        {
            component.displaySongInfo();
            System.out.println();
        }
    }

    public void displaySongDuration()
    {
        System.out.println("Total duration of the album: " + getSongDuration(this));
    }

    public void displaySongSize()
    {
        System.out.println("Total size of the album: " + );
    }

    private int getSongDuration(SongComponent component)
    {
        if(component instanceof Song)
        {
            return ((Song)(component)).duration;
        }

        int totalDuration = 0;
        for(SongComponent c : ((SongAlbum)component).songComponents)
        {
            totalDuration += getSongDuration(c);
        }
        return totalDuration;
    }

    private int getSongSize(SongComponent component)
    {
        if(component instanceof Song)
        {
            return ((Song)(component)).size;
        }

        int totalSize = 0;
        for(SongComponent c : ((SongAlbum)component).songComponents)
        {
            totalSize += getSongSize(c);
        }
        return totalSize;
    }
}

public class Composite {
    public static void main(String[] args) {
        
    }
}
