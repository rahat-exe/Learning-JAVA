

 class Q11 {
    public static void main(String args[]){
        String text = "ghjkljhgfddfgh";
        int length = text.length();
        int vowels = 0;
        for(int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                vowels++;
            }
        }
        int consonants = length - vowels;
        System.out.println("Voewl "+vowels+" Consonants"+consonants);
    }
}
