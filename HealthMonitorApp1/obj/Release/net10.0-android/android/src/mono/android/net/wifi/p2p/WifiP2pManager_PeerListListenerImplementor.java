package mono.android.net.wifi.p2p;


public class WifiP2pManager_PeerListListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.PeerListListener
{

	public WifiP2pManager_PeerListListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_PeerListListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IPeerListListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPeersAvailable (android.net.wifi.p2p.WifiP2pDeviceList p0)
	{
		n_onPeersAvailable (p0);
	}

	private native void n_onPeersAvailable (android.net.wifi.p2p.WifiP2pDeviceList p0);

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
