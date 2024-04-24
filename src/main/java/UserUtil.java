import java.util.ArrayList;

public class UserUtil {


    private String userName;
    private boolean online;
    private ArrayList<String> songList = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public boolean isOnline() {
        return online;
    }

    public String toString() {
        String s = "" + userName + ": " + this.songList.size() + "songs (";
        if (!online)
            s += "not ";
        return s + "online)";
    }

    public ArrayList<String> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<String> songList) {
        this.songList = songList;
    }

    public void ajouterSong(String song) {
        songList.add(song);
    }

    //sizeofsonglist
    public int sizeOf(ArrayList<String> songList) {
        return songList.size();
    }
    //removesongfromlist

    public void removeSong(String song) {

        if (this.songList.isEmpty()) {
            throw new RuntimeException("liste vide");
        } else {

            this.songList.remove(this.getSong(song));
        }


    }

    //getsongfromlist
    public String getSong(String songName) {

        for (String song : songList) {
            if (songName.equalsIgnoreCase(song)) {
                return song;

            }
        }

        throw new RuntimeException("song non trouvee");
    }

    //containsonginlist
    public boolean containSong(String songName) {

         return   this.songList.contains(songName);
    }

    //isEmpty
    public boolean isEmpty(ArrayList<String> songList) {
        return this.sizeOf(songList) == 0;

    }
}
