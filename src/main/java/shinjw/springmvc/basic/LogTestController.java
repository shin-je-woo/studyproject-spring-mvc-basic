package shinjw.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log ={}", name);
        log.debug("debug log ={}", name);
        log.info("info log ={}", name);
        log.warn("warn log ={}", name);
        log.error("error log ={}", name);

        return "OK";
    }

}
