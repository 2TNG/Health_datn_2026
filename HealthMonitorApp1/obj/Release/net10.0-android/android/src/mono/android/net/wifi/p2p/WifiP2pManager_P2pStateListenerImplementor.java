package mono.android.net.wifi.p2p;


public class WifiP2pManager_P2pStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.P2pStateListener
{

	public WifiP2pManager_P2pStateListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_P2pStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IP2pStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onP2pStateAvailable (int p0)
	{
		n_onP2pStateAvailable (p0);
	}

	private native void n_onP2pStateAvailable (int p0);

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
