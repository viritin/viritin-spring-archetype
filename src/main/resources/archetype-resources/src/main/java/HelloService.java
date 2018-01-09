#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHi(String name) {
        return "Hi " + name + "!";
    }
}
