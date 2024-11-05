public class SongDetails {
    String title;
    String artist;
    int count;

    SongDetails(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    String getTitle(){
        return this.title;
    }

    String getArtist(){
        return this.artist;
    }

    int howMany(int listenerCount){
        this.count += listenerCount;
        return count;
    }

    public static void main(String[] args){

        SongDetails hikaruNara = new SongDetails("Hikaru Nara", "Goose House");

        assert hikaruNara.getArtist().equals("Goose House") : "Expect \"Goose House\" for getArtist() when SongDetails = [\"Hikaru Nara\", \"Goose House\"]";

        assert hikaruNara.getTitle().equals("Hikaru Nara") : "Expect \"Hikaru Nara\" for getTitle() when SongDetails = [\"Hikaru Nara\", \"Goose House\"]";

        assert hikaruNara.howMany(5) == 5 : "howMany for Hikaru Naru => 3";

        assert hikaruNara.howMany(22) == 27 : "howMany for Hikaru Naru => 27";


        System.out.println("All test cases in main function passed");

    }
}
