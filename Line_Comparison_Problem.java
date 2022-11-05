public class Line_Comparison_Problem {
    //***(1)***As a fan of geometry, I want to model a line based on a point
    //consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate its length.
    //- A Length as 2 Points (x1, y1) and (x2, y2)
    // - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
    public static void main(String[] args)
    {
        // point 1
        double x1 = 1;
        double y1 = 1;

        // point 2
        double x2 = 5;
        double y2 = 5;

        double length;

        // Calculate distance between two points
        length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
        System.out.println("length of a line :" + length);
    }

}

//***(2)***As a fan of geometry, I want to check equality of two lines
//based on the end points, So that I know when two lines are the equal.
// - Using Java equals method to check equality of 2 Lengths is preferable.

    class UC2
{
    public static void main(String[] args)
    {
        //line 1
        // point 1
        double x1 = 1;
        double y1 = 1;

        // point 2
        double x2 = 5;
        double y2 = 5;

        double length1;

        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
        System.out.println("length of a line :" + length1);

        //line 2
        // point 1
        double lx1 = 1;
        double ly1 = 1;

        // point 2
        double lx2 = 5;
        double ly2 = 5;

        double length2;

        length2 = Math.sqrt((lx2 - lx1) * (lx2 - lx1) + (ly2 - ly1)* (ly2 - ly1));
        System.out.println("length of a line :" + length2);

        if ( length1 == length2 )
        {
            System.out.println ("length of two lines are equal");
        }
        else
        {
            System.out.println ("length of two lines are not equal");
        }
    }
}

//As a fan of geometry, I want to compare two lines based on
//the end points, So that I know one line is equal, greater or less than the other line.
// - Using Java compareTo method to compare 2 Lengths is preferable.

class Line_ComputationUC3
{
    public static void main(String[] args)
    {
        //line 1
        // point 1
        double x1 = 2;
        double y1 = 2;

        // point 2
        double x2 = 6;
        double y2 = 6;

        double length1;

        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
        System.out.println("length of a line1 :" + length1);

        //line 2
        // point 1
        double lx1 = 8;
        double ly1 = 8;

        // point 2
        double lx2 = 5;
        double ly2 = 5;

        double length2;

        length2 = Math.sqrt((lx2 - lx1) * (lx2 - lx1) + (ly2 - ly1)* (ly2 - ly1));
        System.out.println("length of a line2 :" + length2);

        if ( length1 == length2 )
        {
            System.out.println ("length of two lines are equal");
        }
        else if ( length1 > length2)
        {
            System.out.println ("length1 is greater than length2");
        }
        else
        {
            System.out.println ("length1 is lesser than length2");
        }
    }
}
























































