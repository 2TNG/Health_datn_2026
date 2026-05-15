package mono.android.net.wifi.p2p;


public class WifiP2pManager_DnsSdServiceResponseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.DnsSdServiceResponseListener
{

	public WifiP2pManager_DnsSdServiceResponseListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_DnsSdServiceResponseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IDnsSdServiceResponseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDnsSdServiceAvailable (java.lang.String p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pDevice p2)
	{
		n_onDnsSdServiceAvailable (p0, p1, p2);
	}

	private native void n_onDnsSdServiceAvailable (java.lang.String p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pDevice p2);

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
