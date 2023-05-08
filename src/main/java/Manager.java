public class Manager {
    String[] names;
    int limit;

    public Manager() {
        names = new String[0];
        limit = 10;
    }

    public Manager(int limit) {
        names = new String[0];
        this.limit = limit;
    }

    public void add(String x) {
        String[] updateNames = new String[names.length + 1];

        for (int i = 0; i < names.length; ++i) {
            updateNames[i] = names[i];
        }
        updateNames[names.length] = x;
        names = updateNames;

    }

    public String[] findAll() {
        String[] allFilms = new String[names.length];
        for (int i = 0; i < names.length; ++i) {
            allFilms[i] = names[i];
        }
        return allFilms;
    }

    public String[] findLast() {

        int resultLength;
        if (names.length >= limit) {
            resultLength = limit;
        } else {
            resultLength = names.length;
        }
        String[] lastFilms = new String[resultLength];
        for (int i = 0; i < resultLength; ++i) {
            lastFilms[i] = names[(names.length - resultLength) + i];
        }
        for (int i = 0; i < resultLength / 2; ++i) {
            String t = lastFilms[i];
            lastFilms[i] = lastFilms[resultLength - i - 1];
            lastFilms[resultLength - i - 1] = t;
        }
        return lastFilms;
    }
}
