package md5bb8cda7c6f2e92ce076bef532eff3783;


public class GeofenceTransitionsIntentService
	extends mono.android.app.IntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Geofence.Plugin.GeofenceTransitionsIntentService, Geofence.Plugin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GeofenceTransitionsIntentService.class, __md_methods);
	}


	public GeofenceTransitionsIntentService (java.lang.String p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == GeofenceTransitionsIntentService.class)
			mono.android.TypeManager.Activate ("Geofence.Plugin.GeofenceTransitionsIntentService, Geofence.Plugin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public GeofenceTransitionsIntentService () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GeofenceTransitionsIntentService.class)
			mono.android.TypeManager.Activate ("Geofence.Plugin.GeofenceTransitionsIntentService, Geofence.Plugin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
