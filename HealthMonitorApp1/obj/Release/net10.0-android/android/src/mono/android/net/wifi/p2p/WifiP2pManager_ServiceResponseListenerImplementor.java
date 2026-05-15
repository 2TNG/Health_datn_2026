package mono.android.net.wifi.p2p;


public class WifiP2pManager_ServiceResponseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.ServiceResponseListener
{

	public WifiP2pManager_ServiceResponseListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_ServiceResponseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IServiceResponseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onServiceAvailable (int p0, byte[] p1, android.net.wifi.p2p.WifiP2pDevice p2)
	{
		n_onServiceAvailable (p0, p1, p2);
	}

	private native void n_onServiceAvailable (int p0, byte[] p1, android.net.wifi.p2p.WifiP2pDevice p2);

	public void onUsdBasedServiceAvailable (android.net.wifi.p2p.WifiP2pDevice p0, android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceResponse p1)
	{
		n_onUsdBasedServiceAvailable (p0, p1);
	}

	private native void n_onUsdBasedServiceAvailable (android.net.wifi.p2p.WifiP2pDevice p0, android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceResponse p1);

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
