package org.boy.web.generate.controller;

import org.boy.web.basic.controller.BasicController;
import org.boy.web.generate.entity.Generate;
import org.boy.web.generate.service.GenerateServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generate")
public class GenerateController extends BasicController<GenerateServiceImpl,Generate> {


}
