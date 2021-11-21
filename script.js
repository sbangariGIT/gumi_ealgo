function algo(a, b){
    if( a > b){
        if(a%b === 0){
            return b;
        }
        else{
            return algo(b, a%b);
        }
    }
    else{
        if(b%a === 0){
            return a;
        }
        else{
            return algo(a, b%a);
        }
    }
}
