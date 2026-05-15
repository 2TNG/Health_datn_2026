package mono.android.app.admin;


public class DevicePolicyManager_OnClearApplicationUserDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener
{

	public DevicePolicyManager_OnClearApplicationUserDataListenerImplementor ()
	{
		super ();
		if (getClass () == DevicePolicyManager_OnClearApplicationUserDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.Admin.DevicePolicyManager+IOnClearApplicationUserDataListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onApplicationUserDataCleared (java.lang.String p0, boolean p1)
	{
		n_onApplicationUserDataCleared (p0, p1);
	}

	private native void n_onApplicationUserDataCleared (java.lang.String p0, boolean p1);

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
