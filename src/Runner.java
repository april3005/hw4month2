public class Runner extends Thread {
    Runner runner;

    public Runner(String name, Runner runner) {
        this.setName(name);
        this.runner = runner;

    }

    public Runner(String name) {
        this.setName(name);


    }

    public void run() {
        try {
            this.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (runner != null) {
            runner.start();
        }
        System.out.printf("\n%s берет палочку и бежит к ", this.getName());

        if (runner != null) {
            System.out.print(runner.getName() + "\n");

            try {
                runner.join();
                this.sleep(3000);
                System.out.printf(
                        "\n%s берет палочку и бежит к ", runner.getName());
                System.out.print(this.getName() + "\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.print(" бежит обратно \n");
        }

        if (this.getName().equals("Runner 1")) {
            System.out.println(this.getName() + " стоит с палочкой ");
        }
    }
}
