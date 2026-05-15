package mono.android.net.wifi.p2p;


public class WifiP2pManager_NetworkInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.NetworkInfoListener
{

	public WifiP2pManager_NetworkInfoListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_NetworkInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+INetworkInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onNetworkInfoAvailable (android.net.NetworkInfo p0)
	{
		n_onNetworkInfoAvailable (p0);
	}

	private native void n_onNetworkInfoAvailable (android.net.NetworkInfo p0);

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
