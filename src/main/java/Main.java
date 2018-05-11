import ratpack.exec.Blocking;
import ratpack.hikari.HikariModule;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import ratpack.groovy.template.TextTemplateModule;
import ratpack.guice.Guice;

import static ratpack.groovy.Groovy.groovyTemplate;

import java.util.*;
import java.sql.*;

import javax.sql.DataSource;

public class Main {
  public static void main(String... args) throws Exception {
    int c= addition(5,9);
    System.out.println("La somme = "+c);

  }
   public static int addition(int a, int b) {
      return (a+b);
    }
}
