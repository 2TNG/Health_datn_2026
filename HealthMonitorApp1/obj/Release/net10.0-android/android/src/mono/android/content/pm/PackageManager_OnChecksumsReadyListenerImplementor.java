package mono.android.content.pm;


public class PackageManager_OnChecksumsReadyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.pm.PackageManager.OnChecksumsReadyListener
{

	public PackageManager_OnChecksumsReadyListenerImplementor ()
	{
		super ();
		if (getClass () == PackageManager_OnChecksumsReadyListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.PM.PackageManager+IOnChecksumsReadyListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChecksumsReady (java.util.List p0)
	{
		n_onChecksumsReady (p0);
	}

	private native void n_onChecksumsReady (java.util.List p0);

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
