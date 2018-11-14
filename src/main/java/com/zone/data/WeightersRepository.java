package com.zone.data;

public interface WeightersRepository {

	public void saveWeighter(Weighter weighter) throws WeightersException;
	public Weighter retrieveWeighter();
	public boolean weighterIsUnique(String username);
}
