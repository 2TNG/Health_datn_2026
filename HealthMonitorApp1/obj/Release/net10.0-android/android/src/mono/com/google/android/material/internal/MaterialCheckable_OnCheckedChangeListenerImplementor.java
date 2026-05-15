package mono.com.google.android.material.internal;


public class MaterialCheckable_OnCheckedChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
{

	public MaterialCheckable_OnCheckedChangeListenerImplementor ()
	{
		super ();
		if (getClass () == MaterialCheckable_OnCheckedChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Internal.IMaterialCheckableOnCheckedChangeListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCheckedChanged (java.lang.Object p0, boolean p1)
	{
		n_onCheckedChanged (p0, p1);
	}

	private native void n_onCheckedChanged (java.lang.Object p0, boolean p1);

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
