package mono.android.app;


public class SearchManager_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.SearchManager.OnDismissListener
{

	public SearchManager_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == SearchManager_OnDismissListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.SearchManager+IOnDismissListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
