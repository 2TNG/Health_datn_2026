package mono.android.net.nsd;


public class NsdManager_RegistrationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.nsd.NsdManager.RegistrationListener
{

	public NsdManager_RegistrationListenerImplementor ()
	{
		super ();
		if (getClass () == NsdManager_RegistrationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Nsd.NsdManager+IRegistrationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRegistrationFailed (android.net.nsd.NsdServiceInfo p0, int p1)
	{
		n_onRegistrationFailed (p0, p1);
	}

	private native void n_onRegistrationFailed (android.net.nsd.NsdServiceInfo p0, int p1);

	public void onServiceRegistered (android.net.nsd.NsdServiceInfo p0)
	{
		n_onServiceRegistered (p0);
	}

	private native void n_onServiceRegistered (android.net.nsd.NsdServiceInfo p0);

	public void onServiceUnregistered (android.net.nsd.NsdServiceInfo p0)
	{
		n_onServiceUnregistered (p0);
	}

	private native void n_onServiceUnregistered (android.net.nsd.NsdServiceInfo p0);

	public void onUnregistrationFailed (android.net.nsd.NsdServiceInfo p0, int p1)
	{
		n_onUnregistrationFailed (p0, p1);
	}

	private native void n_onUnregistrationFailed (android.net.nsd.NsdServiceInfo p0, int p1);

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
