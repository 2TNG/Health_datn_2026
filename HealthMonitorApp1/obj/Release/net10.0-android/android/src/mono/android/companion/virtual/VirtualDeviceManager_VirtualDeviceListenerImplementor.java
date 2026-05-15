package mono.android.companion.virtual;


public class VirtualDeviceManager_VirtualDeviceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener
{

	public VirtualDeviceManager_VirtualDeviceListenerImplementor ()
	{
		super ();
		if (getClass () == VirtualDeviceManager_VirtualDeviceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Companion.Virtual.VirtualDeviceManager+IVirtualDeviceListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onVirtualDeviceClosed (int p0)
	{
		n_onVirtualDeviceClosed (p0);
	}

	private native void n_onVirtualDeviceClosed (int p0);

	public void onVirtualDeviceCreated (int p0)
	{
		n_onVirtualDeviceCreated (p0);
	}

	private native void n_onVirtualDeviceCreated (int p0);

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
