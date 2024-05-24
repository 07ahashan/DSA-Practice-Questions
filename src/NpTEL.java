    class parent {
        String name = "parent";
        String message() {
            return "from parent";
        }
    }
    class Child extends parent {
        String name = "child";
        String message() {
            return "from child";
        }
    }
    public class NpTEL {
        public static void main(String[] args) {
            parent p = new Child();
            System.out.println(p.name + " " + p.message());
        }
    }
