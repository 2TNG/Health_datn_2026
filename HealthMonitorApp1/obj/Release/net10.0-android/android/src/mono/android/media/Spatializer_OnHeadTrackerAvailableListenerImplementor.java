package mono.android.media;


public class Spatializer_OnHeadTrackerAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.Spatializer.OnHeadTrackerAvailableListener
{

	public Spatializer_OnHeadTrackerAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == Spatializer_OnHeadTrackerAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Spatializer+IOnHeadTrackerAvailableListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onHeadTrackerAvailableChanged (android.media.Spatializer p0, boolean p1)
	{
		n_onHeadTrackerAvailableChanged (p0, p1);
	}

	private native void n_onHeadTrackerAvailableChanged (android.media.Spatializer p0, boolean p1);

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
