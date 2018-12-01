package com.zone.data;

import com.zone.entities.Weighter;

public interface WeightersRepository {

	public void saveWeighter(Weighter weighter);
	public Weighter retrieveWeighter(String username);
	public boolean weighterIsUnique(String username);
}
