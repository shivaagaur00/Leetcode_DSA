class Solution {
    public boolean canMakeSquare(char[][] grid) {
        char a1[]=new char[4];
        char a2[]=new char[4];
        char a3[]=new char[4];
        char a4[]=new char[4];
        a1[0]=grid[0][0];
        a1[1]=grid[0][1];
        a1[2]=grid[1][0];
        a1[3]=grid[1][1];
        
        a2[0]=grid[0][1];
        a2[1]=grid[0][2];
        a2[2]=grid[1][1];
        a2[3]=grid[1][2];
        
        a3[0]=grid[1][0];
        a3[1]=grid[1][1];
        a3[2]=grid[2][0];
        a3[3]=grid[2][1];
        
        a4[0]=grid[1][1];
        a4[1]=grid[1][2];
        a4[2]=grid[2][1];
        a4[3]=grid[2][2];
        int count=0;
        int w=0;
        boolean check=false;
        int b=0;
        for(int i=0;i<4;i++){
            if(a1[i]=='W') w++;
            else b++;
        }
        if(w==1 || b==1) check=true;
        if(w==4 || b==4) check=true;
        
        w=0;
        b=0;
        for(int i=0;i<4;i++){
            if(a2[i]=='W') w++;
            else b++;
        }
        
        if(w==1 || b==1) check=true;
        if(w==4 || b==4) check=true;
        
        
        w=0;
        b=0;
        for(int i=0;i<4;i++){
            if(a3[i]=='W') w++;
            else b++;
        }
        if(w==1 || b==1) check=true;
        if(w==4 || b==4) check=true;
        
        
        
        w=0;
        b=0;
        for(int i=0;i<4;i++){
            if(a4[i]=='W') w++;
            else b++;
        }
        if(w==1 || b==1) check=true;
        if(w==4 || b==4) check=true;
        
         
        return check;
    }
}