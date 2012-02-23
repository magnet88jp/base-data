package controllers;

import play.*;
import play.mvc.*;
import jobs.*;

public class Application extends Controller {

 public static void index() {
   new XmlrpcJob().now();
   redirect("/datas/list");
 }
}
