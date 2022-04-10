static int Knight(int x, int y){
//Ener your code here

    int moves = 0;

    int[] xPos = {-2, -2, +2, +2, -1, +1, -1, +1};
    int[] yPos = {-1, +1, -1, +1, -2, -2, +2, +2};

    for(int i=0; i<8; i++)
        if(x + xPos[i] >= 1 && x + xPos[i] <= 8  && y + yPos[i] >= 1 && y + yPos[i] <= 8 )
            moves++;

    return moves;

}