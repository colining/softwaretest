package com.company;

/**
 * Created by asus on 2016/11/28.
 */
public class Triangle {
    public String triangle(double x,double y,double z) {
        if (x+y>z&&x+y>z&&y+z>x)
        {
            if ((x==y)||(y==z)||(x==z))
            {
                if (x==y&&y==z)
                {
                    return "等边三角形";
                }
                if ((x*x+y*y==z*z)||(y*y+z*z==x*x)||(z*z+x*x==y*y))
                {
                    return "等边直角三角形";
                }
                return  "等腰三角形";
            }
            else if ((x*x+y*y==z*z)||(y*y+z*z==x*x)||(z*z+x*x==y*y))
            {
                return "直角三角形";
            }
            else
            {
                return "普通三角形";
            }
        }
        else
            return "无法构成三角形";
    }
}
