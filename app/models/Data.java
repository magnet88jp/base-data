package models;

import javax.persistence.Entity;
import javax.persistence.Lob;
import play.db.jpa.Model;
import play.data.validation.MaxSize;

@Entity
public class Data extends Model {
  public String code;
  public String question;
  @Lob
  @MaxSize(4000)
  public String answer;

  public Data(String code, String question, String answer) {
    this.code = code ;
    this.question = question;
    this.answer = answer;
  }
}

