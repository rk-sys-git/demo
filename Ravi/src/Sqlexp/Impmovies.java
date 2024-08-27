package Sqlexp;



public class Impmovies implements Don {
    @Override
    public String[] getOddMovies(String[] movies){
        String[] val=new String[movies.length];
        int j=0;
        for(int i=0;i<movies.length;i++){
            if(i%2==0){
                String res=movies[i];
                 val[j]=res;
                 j=j+1;

            }
        }
        return val;

    }
    @Override
    public String[] getEvenMovies(String[] movies){
         String[] val=new String[movies.length];
        int j=0;
        for(int i=0;i<movies.length;i++){
            if(i%2!=0){
                String za =movies[i];
                val[j]=za;
                j=j+1;
            }
        }
        return val;


    }
}
