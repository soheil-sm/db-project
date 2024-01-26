package ir.ac.hut.dbproject.exception;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String entityName, String fieldName, Object value) {
        super("No Such " + entityName + " With " + fieldName + " = " + value);
    }
}
