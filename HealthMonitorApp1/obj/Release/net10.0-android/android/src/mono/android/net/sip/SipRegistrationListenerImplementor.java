package mono.android.net.sip;


public class SipRegistrationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.sip.SipRegistrationListener
{

	public SipRegistrationListenerImplementor ()
	{
		super ();
		if (getClass () == SipRegistrationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Sip.ISipRegistrationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRegistering (java.lang.String p0)
	{
		n_onRegistering (p0);
	}

	private native void n_onRegistering (java.lang.String p0);

	public void onRegistrationDone (java.lang.String p0, long p1)
	{
		n_onRegistrationDone (p0, p1);
	}

	private native void n_onRegistrationDone (java.lang.String p0, long p1);

	public void onRegistrationFailed (java.lang.String p0, int p1, java.lang.String p2)
	{
		n_onRegistrationFailed (p0, p1, p2);
	}

	private native void n_onRegistrationFailed (java.lang.String p0, int p1, java.lang.String p2);

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
