package mono.android.net.nsd;


public class NsdManager_DiscoveryListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.nsd.NsdManager.DiscoveryListener
{

	public NsdManager_DiscoveryListenerImplementor ()
	{
		super ();
		if (getClass () == NsdManager_DiscoveryListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Nsd.NsdManager+IDiscoveryListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDiscoveryStarted (java.lang.String p0)
	{
		n_onDiscoveryStarted (p0);
	}

	private native void n_onDiscoveryStarted (java.lang.String p0);

	public void onDiscoveryStopped (java.lang.String p0)
	{
		n_onDiscoveryStopped (p0);
	}

	private native void n_onDiscoveryStopped (java.lang.String p0);

	public void onServiceFound (android.net.nsd.NsdServiceInfo p0)
	{
		n_onServiceFound (p0);
	}

	private native void n_onServiceFound (android.net.nsd.NsdServiceInfo p0);

	public void onServiceLost (android.net.nsd.NsdServiceInfo p0)
	{
		n_onServiceLost (p0);
	}

	private native void n_onServiceLost (android.net.nsd.NsdServiceInfo p0);

	public void onStartDiscoveryFailed (java.lang.String p0, int p1)
	{
		n_onStartDiscoveryFailed (p0, p1);
	}

	private native void n_onStartDiscoveryFailed (java.lang.String p0, int p1);

	public void onStopDiscoveryFailed (java.lang.String p0, int p1)
	{
		n_onStopDiscoveryFailed (p0, p1);
	}

	private native void n_onStopDiscoveryFailed (java.lang.String p0, int p1);

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
