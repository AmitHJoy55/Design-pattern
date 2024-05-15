package Command_Executor_Proxy_Design_Pattern;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CommandPrompt implements Terminal{
    private PowerShell PowerShell;
    private List<String> vulnerable_CMD;
    
    public CommandPrompt() {
        PowerShell = new PowerShell();
        vulnerable_CMD = new ArrayList<>();
        vulnerable_CMD.add("rm -rf");
    }

    @Override
    public void run(String CMD, String USER) {
        if(vulnerable_CMD.contains(CMD) && USER != "admin"){
            System.out.println("Can't EXECUTE This Command Cause CMD: " + CMD);
        }
        else{
            PowerShell.run(CMD,USER);
        }
    }

}
