package mono.android.location;


public class Geocoder_GeocodeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.Geocoder.GeocodeListener
{

	public Geocoder_GeocodeListenerImplementor ()
	{
		super ();
		if (getClass () == Geocoder_GeocodeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Locations.Geocoder+IGeocodeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGeocode (java.util.List p0)
	{
		n_onGeocode (p0);
	}

	private native void n_onGeocode (java.util.List p0);

	public void onError (java.lang.String p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.String p0);

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
