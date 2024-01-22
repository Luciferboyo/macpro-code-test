package com.hkjava.codetest.lomboks;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
public class Developer extends Staff{
  private List<String> skills;

  public Developer(int id,String name,List<String> list){
    super(id,name);
    this.skills = list;
  }


  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills());

    List list = new ArrayList<>(List.of("code","test"));
    Developer developer2 = new Developer(list);
    System.out.println(developer2);
    
    Developer developer3 = new Developer(list);

    System.out.println(developer2.equals(developer3));
    
  }
}
