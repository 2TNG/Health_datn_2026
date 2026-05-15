package mono.android.app;


public class AppOpsManager_OnOpActiveChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.AppOpsManager.OnOpActiveChangedListener
{

	public AppOpsManager_OnOpActiveChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AppOpsManager_OnOpActiveChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.AppOpsManager+IOnOpActiveChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onOpActiveChanged (java.lang.String p0, int p1, java.lang.String p2, boolean p3)
	{
		n_onOpActiveChanged (p0, p1, p2, p3);
	}

	private native void n_onOpActiveChanged (java.lang.String p0, int p1, java.lang.String p2, boolean p3);

	public void onOpActiveChanged (java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, int p6, int p7)
	{
		n_onOpActiveChanged (p0, p1, p2, p3, p4, p5, p6, p7);
	}

	private native void n_onOpActiveChanged (java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, int p6, int p7);

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
