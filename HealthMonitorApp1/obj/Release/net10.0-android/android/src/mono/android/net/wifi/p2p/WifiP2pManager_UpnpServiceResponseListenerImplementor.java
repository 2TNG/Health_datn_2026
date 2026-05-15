package mono.android.net.wifi.p2p;


public class WifiP2pManager_UpnpServiceResponseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.UpnpServiceResponseListener
{

	public WifiP2pManager_UpnpServiceResponseListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_UpnpServiceResponseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IUpnpServiceResponseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onUpnpServiceAvailable (java.util.List p0, android.net.wifi.p2p.WifiP2pDevice p1)
	{
		n_onUpnpServiceAvailable (p0, p1);
	}

	private native void n_onUpnpServiceAvailable (java.util.List p0, android.net.wifi.p2p.WifiP2pDevice p1);

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
