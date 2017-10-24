/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat4;

/**
 *
 * @author zakkizuboys
 */
public class TugasAlgodat4 {

    int ar[] = new int[10];
    int top = -1;
    int down = 0;

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top == ar.length) {
            return true;
        }
        return false;
    }

    public void enqueue(int angka) {
        if (!isFull()) {
            top++; 
            ar[top] = angka; 
            System.out.println("Angka " + angka + " berhasil di enqueue");
        } else {
            System.out.println("Antrian penuh");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int indexDown = down;
            down++; 
            System.out.println("Antrian indek " + indexDown + " berhasil di dequeue");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void view() {
        if (!isEmpty()) {
            System.out.print("Isi Antrian sekarang : ");
            for (int i = down; i <= top; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public static void main(String[] args) {
        TugasAlgodat4 ka = new TugasAlgodat4();

        ka.enqueue(3);
        ka.view();
        ka.enqueue(6);
        ka.enqueue(7);
        ka.view();
        ka.dequeue();
        ka.view();
        ka.dequeue();
        ka.view();
    }

}
