public class OefString {
    private String s = "Ik ben ik, en jij bent jij!";

    public String nieuw(String tweede) {
        String uitkomst = "";
        uitkomst = s.charAt(0) + String.valueOf(tweede.charAt(tweede.length() - 1));
        return uitkomst;
    }

    public void veranderZin() {
        s = s.replaceAll("[.!?,]", "");
        s = s.toLowerCase();
    }

    public String dubbels() {
        String[] woorden = s.split(" ");
        s = "";
        for (int i = 0; i < woorden.length; i++) {
            String eerste = woorden[i];
            if (eerste.equals("")) {
            } else {
                s += eerste + " ";
            }
            for (int j = i; j < woorden.length; j++) {
                if (eerste.equals(woorden[j])) {
                    woorden[j] = "";
                }
            }
        }
        System.out.println(s);
        return s;
    }

    @Override
    public String toString() {
        return "OefString{" +
                "s='" + s + '\'' +
                '}';
    }
}
