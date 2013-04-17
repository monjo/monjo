package org.monjo.document;

/**
 * Interface defining an identifiable MongoDB document.
 * 
 * When your POJO class implements this interface, Monjo assumes that an attribute<br />
 * named <em>id</em> exists in that class, and populates it with the value held by the<br />
 * <em>_id</em> field from MongoDB's document.
 * 
 * @author Caio Filipini
 *
 * @param <T> the type of the document id.
 */
public interface IdentifiableDocument<T> {
	
}
