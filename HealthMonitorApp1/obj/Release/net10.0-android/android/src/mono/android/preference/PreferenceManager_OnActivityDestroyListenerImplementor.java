package mono.android.preference;


public class PreferenceManager_OnActivityDestroyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.preference.PreferenceManager.OnActivityDestroyListener
{

	public PreferenceManager_OnActivityDestroyListenerImplementor ()
	{
		super ();
		if (getClass () == PreferenceManager_OnActivityDestroyListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Preferences.PreferenceManager+IOnActivityDestroyListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActivityDestroy ()
	{
		n_onActivityDestroy ();
	}

	private native void n_onActivityDestroy ();

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
