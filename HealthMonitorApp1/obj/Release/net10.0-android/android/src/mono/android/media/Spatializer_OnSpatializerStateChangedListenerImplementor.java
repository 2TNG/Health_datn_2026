package mono.android.media;


public class Spatializer_OnSpatializerStateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.Spatializer.OnSpatializerStateChangedListener
{

	public Spatializer_OnSpatializerStateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == Spatializer_OnSpatializerStateChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Spatializer+IOnSpatializerStateChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSpatializerAvailableChanged (android.media.Spatializer p0, boolean p1)
	{
		n_onSpatializerAvailableChanged (p0, p1);
	}

	private native void n_onSpatializerAvailableChanged (android.media.Spatializer p0, boolean p1);

	public void onSpatializerEnabledChanged (android.media.Spatializer p0, boolean p1)
	{
		n_onSpatializerEnabledChanged (p0, p1);
	}

	private native void n_onSpatializerEnabledChanged (android.media.Spatializer p0, boolean p1);

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
