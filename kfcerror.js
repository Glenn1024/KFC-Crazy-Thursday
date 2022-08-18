class kfcerror extends Error {
    constructor (){
        super('KFC Crazy Thursday WhoEver Gives me 50 CNY, I Will Thank Him.')
    }
}
throw new kfcerror();
