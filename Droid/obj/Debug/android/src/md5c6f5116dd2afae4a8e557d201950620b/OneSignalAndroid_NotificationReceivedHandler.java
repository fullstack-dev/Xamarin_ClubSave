package md5c6f5116dd2afae4a8e557d201950620b;


public class OneSignalAndroid_NotificationReceivedHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.onesignal.OneSignal.NotificationReceivedHandler
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_notificationReceived:(Lcom/onesignal/OSNotification;)V:GetNotificationReceived_Lcom_onesignal_OSNotification_Handler:Com.OneSignal.Android.OneSignal/INotificationReceivedHandlerInvoker, OneSignal.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.OneSignal.OneSignalAndroid+NotificationReceivedHandler, MasterDetailPageNavigation.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OneSignalAndroid_NotificationReceivedHandler.class, __md_methods);
	}


	public OneSignalAndroid_NotificationReceivedHandler () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OneSignalAndroid_NotificationReceivedHandler.class)
			mono.android.TypeManager.Activate ("Com.OneSignal.OneSignalAndroid+NotificationReceivedHandler, MasterDetailPageNavigation.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void notificationReceived (com.onesignal.OSNotification p0)
	{
		n_notificationReceived (p0);
	}

	private native void n_notificationReceived (com.onesignal.OSNotification p0);

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
