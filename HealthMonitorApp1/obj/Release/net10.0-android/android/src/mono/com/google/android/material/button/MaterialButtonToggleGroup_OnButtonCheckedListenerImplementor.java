package mono.com.google.android.material.button;


public class MaterialButtonToggleGroup_OnButtonCheckedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
{

	public MaterialButtonToggleGroup_OnButtonCheckedListenerImplementor ()
	{
		super ();
		if (getClass () == MaterialButtonToggleGroup_OnButtonCheckedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Button.MaterialButtonToggleGroup+IOnButtonCheckedListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onButtonChecked (com.google.android.material.button.MaterialButtonToggleGroup p0, int p1, boolean p2)
	{
		n_onButtonChecked (p0, p1, p2);
	}

	private native void n_onButtonChecked (com.google.android.material.button.MaterialButtonToggleGroup p0, int p1, boolean p2);

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
