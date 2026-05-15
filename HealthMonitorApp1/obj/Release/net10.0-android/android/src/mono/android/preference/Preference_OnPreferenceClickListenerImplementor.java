package mono.android.preference;


public class Preference_OnPreferenceClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.preference.Preference.OnPreferenceClickListener
{

	public Preference_OnPreferenceClickListenerImplementor ()
	{
		super ();
		if (getClass () == Preference_OnPreferenceClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Preferences.Preference+IOnPreferenceClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onPreferenceClick (android.preference.Preference p0)
	{
		return n_onPreferenceClick (p0);
	}

	private native boolean n_onPreferenceClick (android.preference.Preference p0);

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
