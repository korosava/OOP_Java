

 class Help implements Command
{
    public void execute(){
        System.out.println("Help executed");
    }
}

 class Echo implements Command{
    String string;
    Echo(String string){
        this.string=string;
    }
    public void  execute(){
        System.out.println(string);
    }
}

 class Exit implements Command {
    public void execute(){
        System.out.println("Goodbye!");
    }
}

 class Date implements Command {
    public void execute(){
        System.out.println(System.currentTimeMillis());
    }
}

public class Application {
    public static void main(String[] args){
        if (args == null) {
            System.out.println("Error");
        }else {
            if (args.length >= 1) {
                Command command;
                switch (args[0]) {
                    case "help":
                        if (args.length == 1) {
                            command = new Help();
                            command.execute();
                        } else {
                            System.out.println("Error");
                        }
                        break;
                    case "exit":
                        if (args.length == 1) {
                            command = new Exit();
                            command.execute();
                        } else {
                            System.out.println("Error");
                        }

                        break;
                    case "date":
                        if (args.length == 2) {
                            if (args[1] == "now") {
                                command = new Date();
                                command.execute();
                            } else {
                                System.out.println("Error");
                            }
                        } else {
                            System.out.println("Error");
                        }
                        break;
                    case "echo":
                        if (args.length == 2) {
                            if (args[1] != "") {
                                command = new Echo(args[1]);
                                command.execute();
                            } else {
                                System.out.println("Error");
                            }
                        } else {
                            System.out.println("Error");
                        }
                        break;
                    default:
                        System.out.println("Error");
                }

            } else {
                System.out.println("Error");
            }
        }
    }
}