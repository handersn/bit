package java02.ex01.command;

import java.util.Scanner;

import java02.ex01.ScoreDao;
import java02.ex01.annotation.Component;


@Component
public class ScoreCommand {
  ScoreDao scoreDao;
  Scanner scanner;
  public void setScoreDao(ScoreDao scoreDao) {
    this.scoreDao = scoreDao;
  }
  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }
  
  public void ohora(map){
    
  }
  

}
