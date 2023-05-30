package com.crio.starter.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "meme")
@NoArgsConstructor
public class Meme {

  private String id;

  private String name;

  private String url;

  private String caption;

  public Meme(String id,String name,String url,String caption){
    this.id=id;
    this.name=name;
    this.url=url;
    this.caption=caption;
  }
  
  public Meme(String name,String url,String caption){
    this.name=name;
    this.url=url;
    this.caption=caption;
  }
}
