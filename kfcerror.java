class kfcerror extends Exception {
    public kfcerror(){
        super("KFC Crazy Thursday WhoEver Gives me 50 CNY, I Will Thank Him.");
    }
    public static void main(String[] args) throws Exception {
        throw new kfcerror();
    }
}
