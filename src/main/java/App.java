import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/hero_registrationform", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/hero_registrationform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squad-registration-form", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/squad-registration-form.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  //   get("/squad-list", (request, response) -> {
  //   Map<String, Object> model = new HashMap<String, Object>();
  //   if(Squad.all().size() > 0) {
  //     model.put("squadList", Squad.all());
  //   } else {
  //     model.put("squadList", false);
  //   }
  //   model.put("template", "templates/squad-list.vtl");
  //   return new ModelAndView(model, layout);
  // }, new VelocityTemplateEngine());

    post("/success", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          String name = request.queryParams("name");
          int age = Integer.parseInt(request.queryParams("age"));
          String power = request.queryParams("power");
          String weakness = request.queryParams("weakness");
          Hero newHero = new Hero(name, age, power, weakness);
          request.session().attribute("newHero", newHero);
          model.put("hero", newHero);
          model.put("template", "templates/success.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }
}
