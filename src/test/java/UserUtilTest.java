
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserUtilTest {

    private UserUtil userUtil = new UserUtil();
    String song_one = "song_one";
    String song_two = "song_two";
    String song_three = "song_three";
    ArrayList<String> list_vide;
    ArrayList<String> list_unElement;
    ArrayList<String> list_multiElement;

    @BeforeEach
    public void setup() {
        userUtil = new UserUtil();
        list_vide = new ArrayList<>();
        list_unElement = new ArrayList<>();
        list_multiElement = new ArrayList<>();

        list_unElement.add(song_one);
        list_multiElement.add(song_one);
        list_multiElement.add(song_two);
        list_multiElement.add(song_three);
    }

    @Test
    public void sizeOfArray_test() {

        this.userUtil.setSongList(list_vide);
        assertEquals(0, userUtil.sizeOf(list_vide), "taille devrait etre 0");

        this.userUtil.setSongList(list_unElement);

        assertEquals(1, userUtil.sizeOf(list_unElement), "taille devrait etre 1");
        this.userUtil.setSongList(list_multiElement);




        assertEquals(3, userUtil.sizeOf(list_multiElement), "taille devrait etre 3");
    }


    @Test
    public void removeSongFromList_test() {
        //liste vide
        this.userUtil.setSongList(list_vide);
        RuntimeException ex = assertThrows(RuntimeException.class
                , () -> this.userUtil.removeSong(song_one));
        assertEquals("liste vide", ex.getMessage(),"erreur message");

        //song non trouvee
        this.userUtil.setSongList(list_unElement);

        RuntimeException ex2 = assertThrows(RuntimeException.class
                , () -> this.userUtil.removeSong(song_two));
        assertEquals("song non trouvee", ex2.getMessage(),"erreur message");

        //song trouvee
      list_unElement.remove(song_one);
      assertTrue(this.userUtil.getSongList().isEmpty(), "Liste doit etre vide");

    }

    @Test
    public void getSong_test(){

        this.userUtil.setSongList(list_unElement);

        //lower case
        assertEquals(song_one, this.userUtil.getSong("song_one"), "song est erronee");
        //upper case
        assertEquals(song_one, this.userUtil.getSong("SONG_ONE"), "song est erronee");
        //non existant song
        RuntimeException ex = assertThrows(RuntimeException.class
                , () -> this.userUtil.getSong("song_four"));
        assertEquals("song non trouvee", ex.getMessage(),"erreur message");

    }

    @Test
    public void containSong_test(){
        //song exist
        this.userUtil.setSongList(list_multiElement);

        assertTrue(this.userUtil.containSong("song_one"), "doit contenir song");
        //song non trouvee
        assertFalse(this.userUtil.containSong("song_four"), "ne doit pas contenir song");

        //empty list
        this.userUtil.setSongList(list_vide);
        assertFalse(this.userUtil.containSong(song_one), "ne doit pas contenir song");




    }
}