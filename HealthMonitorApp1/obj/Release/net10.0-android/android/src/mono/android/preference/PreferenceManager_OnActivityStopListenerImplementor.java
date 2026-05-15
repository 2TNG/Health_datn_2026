package mono.android.preference;


public class PreferenceManager_OnActivityStopListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.preference.PreferenceManager.OnActivityStopListener
{

	public PreferenceManager_OnActivityStopListenerImplementor ()
	{
		super ();
		if (getClass () == PreferenceManager_OnActivityStopListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Preferences.PreferenceManager+IOnActivityStopListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActivityStop ()
	{
		n_onActivityStop ();
	}

	private native void n_onActivityStop ();

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
