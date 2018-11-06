/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffers;

import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class BufferUsuario {

    public static boolean login(List<String> l, String u, String p) {
        boolean b = false;
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(u) && comp[1].equals(p)) {
                b = true;
            }
            t++;
        }
        return b;
    }
    
    public static boolean novoUsuario(List<String> l, String u){
        boolean b = true;
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(u)) {
                b = false;
            }
            t++;
        }
        return b;
    }
     public static List<String> apagarUsuario(List<String> l, String u){      
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(u)) {
                l.remove(t);
                break;
                
            }
            t++;
        }
        return l;
    }
     
     public static List<String> editarUsuario(List<String> l, String u, String nu,String s){      
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(u)) {
                l.set(t, nu+";"+s);
                break;              
            }
            t++;
        }
        return l;
    }
}
