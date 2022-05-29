package sr.ice.server.MultimediaDevices;

import SmartHome.*;
import com.zeroc.Ice.Current;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class MusicPlayerI extends MultimediaDeviceI implements MusicPlayer {

    private Song[] availableSongs = {new Song("song1", 180, "Hip-Hop"),
            new Song("song2", 120, "Rock"),
            new Song("song3", 243, "Metal")
    };

    private Song currentSong = null;

    @Override
    public Song[] getAvailableSongs(Current current) throws DeviceTurnedOff {
        if(this.currentState == State.OFF)
            throw new DeviceTurnedOff();
        return availableSongs;
    }

    @Override
    public Status playSong(String songName, Current current) throws DeviceTurnedOff, NotFound {
        AtomicBoolean songChanged = new AtomicBoolean(false);
        if(this.currentState == State.OFF)
            throw new DeviceTurnedOff();
        Arrays.stream(this.availableSongs).forEach(song -> {
            if(song.name.equals(songName)) {
                this.currentSong = song;
                songChanged.set(true);
            }
        });
        if(!songChanged.get())
            throw new NotFound();
        return Status.SUCCESS;
    }

    @Override
    public Song currentlyPlaying(Current current) throws DeviceTurnedOff {
        if(this.currentState == State.OFF)
            throw new DeviceTurnedOff();

        return this.currentSong;
    }
}
