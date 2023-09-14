package myfinalproject.controllers;

import io.swagger.annotations.Api;
import myfinalproject.dao.GroupDAO;
import myfinalproject.dao.PaidDAO;
import myfinalproject.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Paid controller")

@RestController
@RequestMapping("api/paid")
public class PaidController {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private PaidDAO paidDAO;
    @Autowired
    private GroupDAO groupDAO;
}
