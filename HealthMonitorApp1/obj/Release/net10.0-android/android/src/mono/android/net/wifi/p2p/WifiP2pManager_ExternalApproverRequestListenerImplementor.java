package mono.android.net.wifi.p2p;


public class WifiP2pManager_ExternalApproverRequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.ExternalApproverRequestListener
{

	public WifiP2pManager_ExternalApproverRequestListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_ExternalApproverRequestListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IExternalApproverRequestListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAttached (android.net.MacAddress p0)
	{
		n_onAttached (p0);
	}

	private native void n_onAttached (android.net.MacAddress p0);

	public void onConnectionRequested (int p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pDevice p2)
	{
		n_onConnectionRequested (p0, p1, p2);
	}

	private native void n_onConnectionRequested (int p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pDevice p2);

	public void onDetached (android.net.MacAddress p0, int p1)
	{
		n_onDetached (p0, p1);
	}

	private native void n_onDetached (android.net.MacAddress p0, int p1);

	public void onPinGenerated (android.net.MacAddress p0, java.lang.String p1)
	{
		n_onPinGenerated (p0, p1);
	}

	private native void n_onPinGenerated (android.net.MacAddress p0, java.lang.String p1);

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
