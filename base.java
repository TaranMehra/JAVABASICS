 class derived {
     
     static int given() {
          int i = 87;
         return i;
     }
    
  

}

class base extends derived {
    
    static derived mas = new derived();
    public static void main(String[] args) {
        System.out.println(derived.given());
    }

    
}

