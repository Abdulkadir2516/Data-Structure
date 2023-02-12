package Binary_Tree;

import java.util.ArrayList;

/**
 *
 * @author yesil
 */
public class Binary_Tree {

    public node kok;

    public Binary_Tree() {
        kok = null;
    }

    ArrayList listePre = new ArrayList();

    public ArrayList preOrder(node root) {

        if (root != null) {

            listePre.add(root.data);
            preOrder(root.sol);
            preOrder(root.sag);
        }

        return listePre;
    }

    ArrayList listein = new ArrayList();

    public ArrayList inOrder(node root) {

        if (root != null) {

            inOrder(root.sol);
            listein.add(root.data);
            inOrder(root.sag);
        }

        return listein;
    }

    ArrayList listePost = new ArrayList();

    public ArrayList postOrder(node root) {

        if (root != null) {

            postOrder(root.sol);
            postOrder(root.sag);
            listePost.add(root.data);

        }

        return listePost;
    }

    public node remove(node kok, int data) {

        node t1, t2;

        if (kok == null) {
            return null;
        }

        if (kok.data == data) {

            if (kok.sol == null && kok.sag == null) {
                kok = null;
                return null;
            } 
            else if (kok.sol == null){
                t1 = kok.sag;
                return t1;
            } 
            else if(kok.sag == null){
                t2 = kok.sol;
                return t2;
            } 
            else{
                t1 = t2 = kok.sag;
                
                while (t1.sol != null) {
                    t1 = t1.sol;
                }
                t1.sol = kok.sol;
                return t2;
            }
        }
        else{
            if (data < kok.data) {
                kok.sol = remove(kok.sol, data);
            } 
            else{
                kok.sag = remove(kok.sag, data);
            }
        }
        return kok;
    }

    public node insert(node dugum, int data) {

        if (dugum != null) {

            if (data < dugum.data) {
                dugum.sol = insert(dugum.sol, data);
            } else {
                dugum.sag = insert(dugum.sag, data);

            }
        } else {

            dugum = new node(data);

            System.out.println(data + "Aðaca Eklendi");
        }

        return dugum;

    }

    public node find(int data) {

        node x = kok;

        while(x != null){
            if(x.data == data){
                return x;
            } 
            else{
                if (x.data > data){
                    x = x.sol;
                }
                else{
                    x = x.sag;
                }
            }
        }
        return null;
    }

    public boolean isfind(int data) {

        node x = kok;

        while (x != null) {
            if (x.data == data) {
                return true;
            } else {
                if (x.data > data) {
                    x = x.sol;
                } else {
                    x = x.sag;
                }
            }
        }

        return false;
    }

    public node find_R(node dugum, int data){

        if (dugum != null){

            if (dugum.data == data){
                return dugum;
            } 
            else{

                if (dugum.data > data) {
                    dugum = find_R(dugum.sol, data);
                }
                else{
                    dugum = find_R(dugum.sag, data);
                }
            }

        }
        return dugum;
    }

    public int yukseklik(node dugum) {

        if (dugum != null) {

            int sol, sag;

            sol = yukseklik(dugum.sol);

            sag = yukseklik(dugum.sag);

            if (sol > sag) {
                return ++sol;
            } else {
                return ++sag;
            }

        } else {
            return 0;
        }

    }

    public int size(node kok) {
        if (kok != null){
            return size(kok.sol) + size(kok.sag) + 1;
        } 
        else{
            return 0;
        }
    }

    public class node {

        public node sag;
        public node sol;
        public int data;

        public node(int data) {
            this.data = data;
            sag = sol = null;

        }

    }

}
