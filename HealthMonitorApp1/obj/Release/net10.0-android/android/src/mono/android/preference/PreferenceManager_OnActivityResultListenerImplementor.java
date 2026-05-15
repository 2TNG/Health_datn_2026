package mono.android.preference;


public class PreferenceManager_OnActivityResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.preference.PreferenceManager.OnActivityResultListener
{

	public PreferenceManager_OnActivityResultListenerImplementor ()
	{
		super ();
		if (getClass () == PreferenceManager_OnActivityResultListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Preferences.PreferenceManager+IOnActivityResultListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onActivityResult (int p0, int p1, android.content.Intent p2)
	{
		return n_onActivityResult (p0, p1, p2);
	}

	private native boolean n_onActivityResult (int p0, int p1, android.content.Intent p2);

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
