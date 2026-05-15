package mono.android.location;


public class OnNmeaMessageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.OnNmeaMessageListener
{

	public OnNmeaMessageListenerImplementor ()
	{
		super ();
		if (getClass () == OnNmeaMessageListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Locations.IOnNmeaMessageListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onNmeaMessage (java.lang.String p0, long p1)
	{
		n_onNmeaMessage (p0, p1);
	}

	private native void n_onNmeaMessage (java.lang.String p0, long p1);

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
