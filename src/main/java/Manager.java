public class Manager {
    String[] names;
    int k;

    public Manager() {
        names = new String[0];
        k = 10;

    }
    public Manager(int k) {
        names = new String[0];
        this.k = k;

    }
    public void add (String x){
        String[] updateNames = new String[names.length +1];

        for (int i=0;i<names.length; ++i){
            updateNames[i] = names[i];
        }
        updateNames[names.length] = x;
        names = updateNames;

    }
    public String[] findAll(){
        String[] res =   new String[names.length];
        for (int i=0;i<names.length; ++i) {
        res[i] = names[i];
        }
        return res;
    }
    public String[] findLast(){

  int resultLength;
        if (names.length>=k) {

            resultLength = k;
        } else {
            resultLength = names.length;
        }
  String[] result = new String [resultLength];
        for (int i=0;i<resultLength; ++i) {
            result[i]=names[(names.length-resultLength)+i];


        }
        for (int i=0;i<resultLength / 2; ++i) {

          String t=  result[i];
          result[i] = result[resultLength-i-1];
           result[resultLength-i-1] = t;
        }
        return result;
    }
}
