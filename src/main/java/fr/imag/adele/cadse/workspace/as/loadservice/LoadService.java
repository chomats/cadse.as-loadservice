package fr.imag.adele.cadse.workspace.as.loadservice;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.WSModelState;

public interface LoadService {

	String getDescription();
	void run(WSModelState state) throws CadseException ;
}
