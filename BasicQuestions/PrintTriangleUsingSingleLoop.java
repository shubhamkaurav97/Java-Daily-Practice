//Write a program to print triangle using a single loop.

class PrintTriangleUsingSingleLoop {
    public static void main(String[] args) {
        int sizeOfTriangle = 12;
        
        int lineNumber = 1;
        
        int currStar = 0;
        
        for(lineNumber=1;lineNumber<sizeOfTriangle;){
            
            if(currStar < lineNumber){
                System.out.print("* ");
                currStar++;
                continue;
            }
            
            if(currStar == lineNumber){
                System.out.println("");
                lineNumber++;
                currStar=0;
            }
        }
    }
}
