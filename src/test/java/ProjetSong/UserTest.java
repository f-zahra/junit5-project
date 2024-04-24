package ProjetSong;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user= new User();
    @Test
    public void testSongsEquality() {
        //meme chanson
        Song song1 = new Song("Hey Jude", "The Beatles", 4, 35);
        Song song2 = new Song("Hey Jude", "The Beatles", 4, 35);

        // Assert that they are equal using the equals method
        assertTrue(song1.equals(song2), "Les chansons  devraient être égales");

        // chanson differente
        Song song3 = new Song("Yesterday", "The Beatles", 4, 35);

        // Assert that they are not equal
        assertFalse(song1.equals(song3), "Les chansons ne devraient pas être égales");


    }

    @Test
    public void testAddSong() {
        Song newSong = new Song("New Song", "New Artist", 3, 45);
        this.user.setSongList(new ArrayList<>());
        // Add a new song
        user.addSong(newSong);


        assertFalse(user.getSongList().isEmpty(), "La liste ne devrait pas etre vide");
        assertEquals(1, user.getSongList().size(), "la taille de la liste devrait etre 1");
        assertTrue(user.getSongList().contains(newSong), "la liste doit contenir la chanson");
    }

}