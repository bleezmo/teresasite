package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  def contact = Action {
    Ok(views.html.contact())
  }
  def about = Action {
    Ok(views.html.about())
  }
  def faqs = Action {
    Ok(views.html.faqs())
  }
  def howitworks = Action {
    Ok(views.html.howitworks())
  }
  def samples = Action {
    Ok(views.html.samples())
  }
}