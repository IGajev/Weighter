package com.zone.data;

import com.zone.entities.GeneralWeighter;
import com.zone.entities.UpdatedWeighter;

public interface WeightersRepository {

	public void saveWeighter(GeneralWeighter weighter);
	public void updateWeighter(GeneralWeighter loggedWeighter, UpdatedWeighter updatedWeighter);
	public GeneralWeighter retrieveWeighter(String username);
	public boolean weighterIsUnique(String username);
	public boolean passwordValid(String password, String username);
}
