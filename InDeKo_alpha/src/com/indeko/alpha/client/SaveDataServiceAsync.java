package com.indeko.alpha.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SaveDataServiceAsync {
	public void saveData(String data, AsyncCallback<Void> async);
	public void addVeranstaltung(String name, String titel, String ort, Date datum, String info, AsyncCallback<Void> async);
	public void addPublication(String autor, String jahr, String titel, String ort, AsyncCallback<Void> async);
	public void addZeitschrift(String titel, AsyncCallback<Void> async);
	public void addVerbundprojekt(Verbundprojekt verbundProjekt, AsyncCallback<Void> async);
}
