package mono.com.google.android.material.chip;


public class ChipGroup_OnCheckedStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
{

	public ChipGroup_OnCheckedStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ChipGroup_OnCheckedStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Chip.ChipGroup+IOnCheckedStateChangeListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCheckedChanged (com.google.android.material.chip.ChipGroup p0, java.util.List p1)
	{
		n_onCheckedChanged (p0, p1);
	}

	private native void n_onCheckedChanged (com.google.android.material.chip.ChipGroup p0, java.util.List p1);

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
