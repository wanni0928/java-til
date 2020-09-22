package test;

interface FunctionalInterface {
    String method();
}

class Main {
    void functionalMethod(FunctionalInterface obj) {
        System.out.println(obj.method());
    }

    public static void main(String[] args) {
        functionalMethod(()-> "Lambda expression used.");

        functionalMethod(new FunctionalInterface() {
            @Override
            String method() {
                return "Anonymous inner class used.";
            });
        }

    }
}
