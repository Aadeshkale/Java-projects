
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Mainplay  {
    FileInputStream fis;
    BufferedInputStream bif;
    public Player player;
    long pauselocation; 
    long songtotal; 
    String filelocation;
    
    
    public void stop(){
       
          
        if(player!=null){
             player.close();
             pauselocation=0; 
             songtotal=0; 
        }
    }
    public void pause() {
       
          
        if(player!=null){
            try {
             pauselocation = fis.available();
             player.close();
            } catch (IOException ex) {
                System.out.println("Exception: "+ex);
            }
             player.close();
        }
    }
    
     public void resume(){
      try{     
       fis = new FileInputStream(filelocation);
       bif = new BufferedInputStream(fis);
       player = new Player(bif);
       fis.skip(songtotal-pauselocation);
       
       
      } catch(Exception e){
            System.out.println("Error"+e);

        }
        new Thread(){
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                   System.out.println("exception");
                }
            }
        }.start();
      
    }
    
    
    
    
    public void play(String path){
      try{     
       fis = new FileInputStream(path);
       bif = new BufferedInputStream(fis);
       player = new Player(bif);
       songtotal=fis.available();
       filelocation=path;
       
      } catch(Exception e){
          System.out.println("Error"+e);
          
      }
      new Thread(){
          public void run(){
              try {
                  player.play();
              } catch (JavaLayerException ex) {
                 System.out.println("exception");
              }
          }
      }.start();
      
    }
           
    
}
