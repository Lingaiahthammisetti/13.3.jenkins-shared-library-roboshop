def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "730335449147"
        case 'qa':
            return "730335449147"
        case 'uat':
            return "730335449147"
        case 'pre-prod':
            return "730335449147"
        case 'prod':
            return "730335449147"
        default:
            return "nothing"
    } 
}