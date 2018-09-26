package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size;
        int[] array;
        int i,min;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("nhap vao kich thuoc mang:");
            size = scanner.nextInt();
            if(size>20)
                System.out.print("kich thuoc khong vuot qua 20... moi nhap lai");
        }while(size>20);
        array = new int[size];
        System.out.print("nhap cac gia tri:");
        for(i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
            System.out.print("\t");
        }
        min = array[0];
        for(i=0;i<array.length;i++){
            if(array[i]<min)
                array[i]=min;
        }
        System.out.print("gia tri nho nhat trong mang la:"+min);
    }
}
