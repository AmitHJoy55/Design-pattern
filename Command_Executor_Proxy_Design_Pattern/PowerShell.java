package Command_Executor_Proxy_Design_Pattern;

public class PowerShell 
{
    public void run(String CMD, String USER) {
        System.out.println(CMD + " run as " + USER + " successfully");
    }
}
