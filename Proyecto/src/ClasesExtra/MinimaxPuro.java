package ClasesExtra;

import Dominio.Problema;
import Dominio.fichas.Ficha;
import java.util.ArrayList;

/**
 *
 * @author Jordi
 */
public class MinimaxPuro {
    
    private int min(Problema p, int depth, boolean col) {
        if (depth == 0){
            if (p.checkmate(!col)) return 1;
            else return -1; 
        }

        int val = -1;
        ArrayList<Coordenada> moves = posiciones(p,col);
        Coordenada currMove,movePosible;
        for (int i = 0; i < moves.size(); ++i) {
            currMove = moves.get(i);
            ArrayList<Coordenada> movesPosibles = p.getFicha(currMove).posiblesMovimientos(p, currMove);
            for (int x = 0; x < movesPosibles.size(); ++x) { 
                movePosible = movesPosibles.get(x);
                Ficha o = p.getFicha(movePosible);
                p.moveFicha(currMove,movePosible);
                if (!p.mate(!col)) {
                    val = max(p,depth-1,!col);
                }
                p.undoFicha(movePosible,currMove,o);
                if (val == 1) break;
            }
            if (val == 1) break;
        }
        return val;
    }
    /**
     * pre:Dado un Problema P existente , un int depth no nula y un boolean col no nulo
     *  post:devolveremos la evaluación de la parte del max del minimax
     * @param p
     * @param depth
     * @param col
     * @return 
     */
    private int max(Problema p, int depth, boolean col) {
        if (depth == 0) {
            if(p.checkmate(col)) return 1;
            else return -1;
        }
        
        int val = -1;
        ArrayList<Coordenada> moves = posiciones(p,col);
        Coordenada currMove,movePosible;
        for (int i = 0; i < moves.size(); ++i) {
            currMove = moves.get(i);
            ArrayList<Coordenada> movesPosibles = p.getFicha(currMove).posiblesMovimientos(p, currMove);
            for (int x = 0; x < movesPosibles.size(); ++x) { 
                movePosible = movesPosibles.get(x);
                Ficha o = p.getFicha(movePosible);
                p.moveFicha(currMove,movePosible);
                if (!p.mate(!col)) {
                    val = min(p,depth-1,!col);
                }
                p.undoFicha(movePosible,currMove,o);
                if (val == 1) break;
            }
            if (val == 1) break;
        }
        return val;
    }
    

    /**
     * pre:Dado un problema, una profundidad y un color para la máquina no nulos
     * post:devuelve el mejor movimiento 
       de todos sus posibles teniendo en cuenta el color
     * @param p
     * @param depth
     * @param col
     * @return 
     */
    public int decisionMinimax(Problema p, int depth, boolean col) { //hace de "max"
        int val = 0;
        Coordenada currMove,movePosible;
        ArrayList<Coordenada> moves = posiciones(p,col);
        for (int i = 0; i < moves.size(); ++i) {
            currMove = moves.get(i);
            ArrayList<Coordenada> movesPosibles = p.getFicha(currMove).posiblesMovimientos(p, currMove);
            for (int x = 0; x < movesPosibles.size(); ++x) {
                movePosible = movesPosibles.get(x);
                Ficha o = p.getFicha(movePosible);
                p.moveFicha(currMove,movePosible);
                if (!p.mate(!col)) {
                    val = min(p,depth-1,!col);
                }
                p.undoFicha(movePosible,currMove,o);
                if (val == 1) break;
            }
            if (val == 1) break;
        }
        return val;
    }
    
    private ArrayList<Coordenada> posiciones(Problema p, boolean color) {
        ArrayList<Coordenada> moves = new ArrayList();
        for (int i = 0; i< 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (p.getFicha(new Coordenada(i,j))!= null && p.getFicha(new Coordenada(i,j)).getColor() == color){
                    moves.add(new Coordenada(i,j));
                }
            }
        }
        return moves;
    }
}
