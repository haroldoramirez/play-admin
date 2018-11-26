/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class DashboardController extends Controller {

    public Result panel() {
        return ok(views.html.dashboard.render());
    }
}
