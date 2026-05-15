package mono.android.net.wifi.p2p;


public class WifiP2pManager_WifiP2pListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.WifiP2pListener
{

	public WifiP2pManager_WifiP2pListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_WifiP2pListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IWifiP2pListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDeviceConfigurationChanged (android.net.wifi.p2p.WifiP2pDevice p0)
	{
		n_onDeviceConfigurationChanged (p0);
	}

	private native void n_onDeviceConfigurationChanged (android.net.wifi.p2p.WifiP2pDevice p0);

	public void onDiscoveryStateChanged (int p0)
	{
		n_onDiscoveryStateChanged (p0);
	}

	private native void n_onDiscoveryStateChanged (int p0);

	public void onFrequencyChanged (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1)
	{
		n_onFrequencyChanged (p0, p1);
	}

	private native void n_onFrequencyChanged (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1);

	public void onGroupCreated (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1)
	{
		n_onGroupCreated (p0, p1);
	}

	private native void n_onGroupCreated (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1);

	public void onGroupCreating ()
	{
		n_onGroupCreating ();
	}

	private native void n_onGroupCreating ();

	public void onGroupCreationFailed (int p0)
	{
		n_onGroupCreationFailed (p0);
	}

	private native void n_onGroupCreationFailed (int p0);

	public void onGroupNegotiationRejectedByUser ()
	{
		n_onGroupNegotiationRejectedByUser ();
	}

	private native void n_onGroupNegotiationRejectedByUser ();

	public void onGroupRemoved ()
	{
		n_onGroupRemoved ();
	}

	private native void n_onGroupRemoved ();

	public void onListenStateChanged (int p0)
	{
		n_onListenStateChanged (p0);
	}

	private native void n_onListenStateChanged (int p0);

	public void onP2pStateChanged (int p0)
	{
		n_onP2pStateChanged (p0);
	}

	private native void n_onP2pStateChanged (int p0);

	public void onPeerClientDisconnected (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1)
	{
		n_onPeerClientDisconnected (p0, p1);
	}

	private native void n_onPeerClientDisconnected (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1);

	public void onPeerClientJoined (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1)
	{
		n_onPeerClientJoined (p0, p1);
	}

	private native void n_onPeerClientJoined (android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1);

	public void onPeerListChanged (android.net.wifi.p2p.WifiP2pDeviceList p0)
	{
		n_onPeerListChanged (p0);
	}

	private native void n_onPeerListChanged (android.net.wifi.p2p.WifiP2pDeviceList p0);

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
