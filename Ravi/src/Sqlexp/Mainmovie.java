package Sqlexp;

public class Mainmovie {
    public static void main(String[]args){
        String[] movies={"ga","ravi","kalyan","raju","dgf","kal","ass"};
        Impmovies s=new Impmovies();
        String[] qe=s.getOddMovies(movies);
        for(int i=0;i<qe.length;i++){
            String sd=qe[i];
            System.out.println(sd);
        }
    }
}
