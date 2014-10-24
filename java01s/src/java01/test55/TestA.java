package java01.test55;

public class TestA implements Gamer {
  int count;
  
  @Override
  public String who() {
    return "김광철";
  }

  @Override
  public void init() {}

  @Override
  public String play() {
    count++;
    if (count < 50) 
      return Gamer.ROCK;
    else if(count > 100)  
      return Gamer.PAPER;
    else if(count > 150)
      return Gamer.SCISSORS;
    else
      return Gamer.ROCK;
        
       
  }

  @Override
  public void sendResult(int result) {
    if(result == -1){
      play();
      
    }//end if
    
         
       }
            
    
    
         
      
    
  }

}
