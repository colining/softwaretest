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
                    return "�ȱ�������";
                }
                if ((x*x+y*y==z*z)||(y*y+z*z==x*x)||(z*z+x*x==y*y))
                {
                    return "�ȱ�ֱ��������";
                }
                return  "����������";
            }
            else if ((x*x+y*y==z*z)||(y*y+z*z==x*x)||(z*z+x*x==y*y))
            {
                return "ֱ��������";
            }
            else
            {
                return "��ͨ������";
            }
        }
        else
            return "�޷�����������";
    }
}
