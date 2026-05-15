package mono.android.app;


public class SearchManager_OnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.SearchManager.OnCancelListener
{

	public SearchManager_OnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == SearchManager_OnCancelListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.SearchManager+IOnCancelListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
