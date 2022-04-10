static int Knight(int x, int y){
//Ener your code here

    int moves = 0;

    //Upward Left
    if(x-2 >= 1 && x-2 <= 8  && y-1 >= 1 && y-1 <= 8 )
        moves++;
    //Upward Right
    if(x-2 >= 1 && x-2 <= 8  && y+1 >= 1 && y+1 <= 8)
        moves++;

    //Downward Left
    if(x+2 >= 1 && x+2 <= 8  && y-1 >= 1 && y-1 <= 8 )
        moves++;
    //Downward Right
    if(x+2 >= 1 && x+2 <= 8  && y+1 >= 1 && y+1 <= 8)
        moves++;
    

    //Left Upward
    if(x-1 >= 1 && x-1 <= 8 && y-2 >= 1 && y-2 <= 8)
        moves++;
    //Left Downward
    if(x+1 >= 1 && x+1 <= 8 && y-2 >= 1 && y-2 <= 8)
        moves++;

    //Right Upward
    if(x-1 >= 1 && x-1 <= 8 && y+2 >= 1 && y+2 <= 8)
        moves++;
    //Right Downward
    if(x+1 >= 1 && x+1 <= 8 && y+2 >= 1 && y+2 <= 8)
        moves++;

    return moves;

}