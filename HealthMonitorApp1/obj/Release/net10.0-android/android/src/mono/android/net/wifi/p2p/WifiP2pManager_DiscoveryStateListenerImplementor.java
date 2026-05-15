package mono.android.net.wifi.p2p;


public class WifiP2pManager_DiscoveryStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.DiscoveryStateListener
{

	public WifiP2pManager_DiscoveryStateListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_DiscoveryStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IDiscoveryStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDiscoveryStateAvailable (int p0)
	{
		n_onDiscoveryStateAvailable (p0);
	}

	private native void n_onDiscoveryStateAvailable (int p0);

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
