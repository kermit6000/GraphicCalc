/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphiccalc;

/**
 *
 * @author Thomas STOCKER
 */
public class DIV extends OPBINARY {
    public DIV(EXPR left, EXPR right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public double eval() {
        return left.eval() / right.eval();
    }
    
    @Override
    public double eval(double x) {
        return left.eval(x) / right.eval(x);
    }
}
