package com.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by hejiecheng on 17/3/8.
 */
public class InputProductController implements Controller {

    private static final Log logger = LogFactory.getLog(InputProductController.class);

    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("InputProductController called") ;
        return new ModelAndView("ProductForm") ;
    }
}
