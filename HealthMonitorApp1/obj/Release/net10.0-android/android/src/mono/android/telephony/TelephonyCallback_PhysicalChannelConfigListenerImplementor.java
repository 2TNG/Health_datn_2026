package mono.android.telephony;


public class TelephonyCallback_PhysicalChannelConfigListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.PhysicalChannelConfigListener
{

	public TelephonyCallback_PhysicalChannelConfigListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_PhysicalChannelConfigListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IPhysicalChannelConfigListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPhysicalChannelConfigChanged (java.util.List p0)
	{
		n_onPhysicalChannelConfigChanged (p0);
	}

	private native void n_onPhysicalChannelConfigChanged (java.util.List p0);

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
