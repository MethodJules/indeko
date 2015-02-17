package com.indeko.alpha.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("data")
public interface SaveDataService extends RemoteService {
	public void saveData(String data);
	public void addVeranstaltung(String name, String titel, String ort, Date datum, String info);
	public void addPublication(String autor, String jahr, String titel, String ort);
	public void addZeitschrift(String titel);
	public void addVerbundprojekt(Verbundprojekt verbundProjekt);
}
