class Student {
    int roll_no = 18;
}

class Test extends Student {
    int sem1 = 96, sem2 = 84;
}

interface Score {
    public void score();
}

class Result extends Test implements Score {
    int s = 40;

    public void score() {
        System.out.println("Total Marks are : " + (sem1 + sem2 + s));
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.score();
    }
}