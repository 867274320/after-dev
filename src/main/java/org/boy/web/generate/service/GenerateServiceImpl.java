package org.boy.web.generate.service;

import org.boy.web.basic.service.BasicServiceImpl;
import org.boy.web.generate.entity.Generate;
import org.boy.web.generate.mapper.GenerateMapper;
import org.springframework.stereotype.Service;

@Service
public class GenerateServiceImpl extends BasicServiceImpl<GenerateMapper, Generate> implements GenerateService {
}
