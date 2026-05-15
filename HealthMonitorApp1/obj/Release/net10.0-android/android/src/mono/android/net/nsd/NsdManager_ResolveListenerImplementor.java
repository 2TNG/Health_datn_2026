package mono.android.net.nsd;


public class NsdManager_ResolveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.nsd.NsdManager.ResolveListener
{

	public NsdManager_ResolveListenerImplementor ()
	{
		super ();
		if (getClass () == NsdManager_ResolveListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Nsd.NsdManager+IResolveListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onResolveFailed (android.net.nsd.NsdServiceInfo p0, int p1)
	{
		n_onResolveFailed (p0, p1);
	}

	private native void n_onResolveFailed (android.net.nsd.NsdServiceInfo p0, int p1);

	public void onServiceResolved (android.net.nsd.NsdServiceInfo p0)
	{
		n_onServiceResolved (p0);
	}

	private native void n_onServiceResolved (android.net.nsd.NsdServiceInfo p0);

	public void onResolutionStopped (android.net.nsd.NsdServiceInfo p0)
	{
		n_onResolutionStopped (p0);
	}

	private native void n_onResolutionStopped (android.net.nsd.NsdServiceInfo p0);

	public void onStopResolutionFailed (android.net.nsd.NsdServiceInfo p0, int p1)
	{
		n_onStopResolutionFailed (p0, p1);
	}

	private native void n_onStopResolutionFailed (android.net.nsd.NsdServiceInfo p0, int p1);

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
