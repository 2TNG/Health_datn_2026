package mono.android.content;


public class SharedPreferences_OnSharedPreferenceChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

	public SharedPreferences_OnSharedPreferenceChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SharedPreferences_OnSharedPreferenceChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSharedPreferenceChanged (android.content.SharedPreferences p0, java.lang.String p1)
	{
		n_onSharedPreferenceChanged (p0, p1);
	}

	private native void n_onSharedPreferenceChanged (android.content.SharedPreferences p0, java.lang.String p1);

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
