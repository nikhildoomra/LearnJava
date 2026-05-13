package com.learnjava;

import java.util.Arrays;

public class LearnEnums {
    public static void main(String[] args) {
        System.out.println(Days.Monday.getDescription());
        System.out.println(Days.fromString("tuesday"));
    }
}


enum Days {
  Monday("monday"),
  Tuesday("tuesday");
  
  private String description;
  Days(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public static Days fromString(String val) {
    return Arrays.stream(Days.values()).filter(day -> day.description.equalsIgnoreCase(val))
      .findFirst()
      .orElse(null);
  }
}
