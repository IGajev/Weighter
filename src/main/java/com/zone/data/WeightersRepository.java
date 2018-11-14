package com.zone.data;

import com.zone.entities.Weighter;

public interface WeightersRepository {

	public void saveWeighter(Weighter weighter) throws WeightersException;
	public Weighter retrieveWeighter();
	public boolean weighterIsUnique(String username);
}
