package mono.android.app;


public class AppOpsManager_OnOpChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.AppOpsManager.OnOpChangedListener
{

	public AppOpsManager_OnOpChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AppOpsManager_OnOpChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.AppOpsManager+IOnOpChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onOpChanged (java.lang.String p0, java.lang.String p1)
	{
		n_onOpChanged (p0, p1);
	}

	private native void n_onOpChanged (java.lang.String p0, java.lang.String p1);

	public void onOpChanged (java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3)
	{
		n_onOpChanged (p0, p1, p2, p3);
	}

	private native void n_onOpChanged (java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3);

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
