package com.sorting;

/**
 * Created by user on 25.02.2016.
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr){
    /*�� ������� ����� ������������� ��� ������������
      ��������� ������� (0 - ���������, 1-���������,
      2-���������,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*������������, ��� ������ ������� (� ������
           ������������ ���������) �������� ����������� */
            int min = arr[i];
            int min_i = i;
        /*� ���������� ����� ������������ ���� �������,
           ������� ������ ��������������� ��������*/
            for (int j = i+1; j < arr.length; j++) {
                //���� �������, ���������� ��� ������
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*���� ������� �������, �������, ��� �� ������� �������,
          ������ �� �������*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }

}
