package mono.android.net.wifi;


public class WifiManager_LocalOnlyConnectionFailureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener
{

	public WifiManager_LocalOnlyConnectionFailureListenerImplementor ()
	{
		super ();
		if (getClass () == WifiManager_LocalOnlyConnectionFailureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.WifiManager+ILocalOnlyConnectionFailureListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onConnectionFailed (android.net.wifi.WifiNetworkSpecifier p0, int p1)
	{
		n_onConnectionFailed (p0, p1);
	}

	private native void n_onConnectionFailed (android.net.wifi.WifiNetworkSpecifier p0, int p1);

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
