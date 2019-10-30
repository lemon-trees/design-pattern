package patterns.behavioral.visitor;

/**
 * Visitor
 */
public interface Visitor
{
    void visit(Engineer engineer);
    
    void visit(Manager manager);
    
}
