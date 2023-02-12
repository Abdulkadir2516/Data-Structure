/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Arrays;

import Binary_Tree.Binary_Tree;
import java.util.Random;

/**
 *
 * @author yesil
 *
    /**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        
        int[] dizi = {18,13,-5,16,25,34,12,10};
        
        Quick_Sort nesne = new Quick_Sort(dizi);
        
        System.out.println("Sýralanmýþ dizi");
        
        
        System.out.println(Arrays.toString(dizi));
        
        
        Jump_Search nesne2 = new Jump_Search();
        
        int eleman = 16;
        int index = nesne2.jumpSearch(dizi, eleman);
        
        System.out.println("Aranan Eleman \t=> " + eleman + "\nÝndexi \t\t\t=> " + index );
        
        BtTree();

        /**
         * SinglyLinkedList_CircleQueue object = new
         * SinglyLinkedList_CircleQueue();
         *
         * Binary_Tree nesne = new Binary_Tree();
         *
         *
         * /**
         * object.add(258); System.out.println(object.find(0));
         * object.insert(365, 0);
         *
         * System.out.println(object.find(0));
         *
         * oyun(object);
         *
         * stack kuyruk = new stack(20);
         *
         * kuyruk.Push(5); kuyruk.Push(85); kuyruk.Push(51); kuyruk.Push(55);
         * kuyruk.Push(45);
         
    }*/
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int[] dizi = {18,13,-5,16,25,34,12,10};
        
        Quick_Sort nesne = new Quick_Sort(dizi);
        
        System.out.println("Sýralanmýþ dizi");
        
        
        System.out.println(Arrays.toString(dizi));
        
        
        Jump_Search nesne2 = new Jump_Search();
        
        int eleman = 16;
        int index = nesne2.jumpSearch(dizi, eleman);
        
        System.out.println("Aranan Eleman \t=> " + eleman + "\nÝndexi \t\t\t=> " + index );
        */
        BtTree();

        /**
         * SinglyLinkedList_CircleQueue object = new
         * SinglyLinkedList_CircleQueue();
         *
         * Binary_Tree nesne = new Binary_Tree();
         *
         *
         * /**
         * object.add(258); System.out.println(object.find(0));
         * object.insert(365, 0);
         *
         * System.out.println(object.find(0));
         *
         * oyun(object);
         *
         * stack kuyruk = new stack(20);
         *
         * kuyruk.Push(5); kuyruk.Push(85); kuyruk.Push(51); kuyruk.Push(55);
         * kuyruk.Push(45);
         */
    }

    public static void oyun(SinglyLinkedList_CircleQueue object) {

        SinglyLinkedList_CircleQueue nesne = object;

        String[] arr = {"Abdulkadir", "Mehmet", "Kayra", "Erdem", "Metehan", "Gayret", "Zeynep"};

        for (int i = 0; i < arr.length; ++i) {
            nesne.add(arr[i]);
        }

        Random rnd = new Random();

        int int_random = rnd.nextInt(100);

        int baslangýc = int_random % nesne.lenght();

        System.out.println("baþlangýç => " + baslangýc);

        System.out.println("baþlayan => " + nesne.find(baslangýc));

        int boyut = nesne.lenght();

        for (int i = 0; i < boyut; ++i) {

            int rastgele = rnd.nextInt(100);

            int rst = (rastgele + baslangýc) % nesne.lenght();

            System.out.println("tahmin sayýlarý  => " + rastgele % nesne.lenght());

            baslangýc = rst - 1;// çýkan kiþi den devam etmesi için kullandým yoksa baþtan saymaya baþlýyor

            nesne.remove(rst);

            if (nesne.lenght() == 1) {
                System.out.println("Kazanan Kiþi => " + nesne.find(0));
                break;
            }

        }

    }

    public static void BtTree() {
        Integer[] arr = {25, 16, 33, 5, 49, 19, 35, 28, 26, 18, 60};

        Binary_Tree bt = new Binary_Tree();

        for (Integer eleman : arr) {
            bt.kok = bt.insert(bt.kok, eleman);
        }

        System.out.println(bt.kok.data);

        System.out.println(bt.find(49).data);

        System.out.println(Arrays.toString(arr));
        
        System.out.println(bt.preOrder(bt.kok));

        System.out.println(bt.inOrder(bt.kok));

        System.out.println(bt.postOrder(bt.kok));


        System.out.println(bt.isfind(38));
        
                
        System.out.println(bt.size(bt.kok));

        System.out.println(bt.yukseklik(bt.kok));
        
    }

}
