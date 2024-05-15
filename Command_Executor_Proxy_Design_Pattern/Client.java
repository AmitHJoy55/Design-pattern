package Command_Executor_Proxy_Design_Pattern;

public class Client {
    public static void main(String[] args) 
    {
        CommandPrompt PROXYSHELL = new CommandPrompt();
        PROXYSHELL.run("Proxy design pattern", "user");
        PROXYSHELL.run("rm -rf", "user");
        PROXYSHELL.run("rm -rf", "admin");
    }
}
