package mono.android.preference;


public class Preference_OnPreferenceChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.preference.Preference.OnPreferenceChangeListener
{

	public Preference_OnPreferenceChangeListenerImplementor ()
	{
		super ();
		if (getClass () == Preference_OnPreferenceChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Preferences.Preference+IOnPreferenceChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onPreferenceChange (android.preference.Preference p0, java.lang.Object p1)
	{
		return n_onPreferenceChange (p0, p1);
	}

	private native boolean n_onPreferenceChange (android.preference.Preference p0, java.lang.Object p1);

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
