package pl.edu.icm.cermine.tools.classification.general;

import java.util.List;
import pl.edu.icm.cermine.exception.TransformationException;
import pl.edu.icm.cermine.structure.model.BxDocument;

/**
 * Documents extractor interface.
 * 
 * @author Paweł Szostek
 */
public interface DocumentsExtractor {
    
    /**
     * Extracts documents.
     * 
     * @return a list of extracted documents
     * @throws TransformationException 
     */
	List<BxDocument> getDocuments() throws TransformationException;
    
}
