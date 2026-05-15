package mono.android.app;


public class FragmentManager_OnBackStackChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.FragmentManager.OnBackStackChangedListener
{

	public FragmentManager_OnBackStackChangedListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentManager_OnBackStackChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.FragmentManager+IOnBackStackChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBackStackChanged ()
	{
		n_onBackStackChanged ();
	}

	private native void n_onBackStackChanged ();

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
