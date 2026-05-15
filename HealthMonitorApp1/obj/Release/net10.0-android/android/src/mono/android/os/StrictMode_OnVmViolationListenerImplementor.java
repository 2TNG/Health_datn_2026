package mono.android.os;


public class StrictMode_OnVmViolationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.StrictMode.OnVmViolationListener
{

	public StrictMode_OnVmViolationListenerImplementor ()
	{
		super ();
		if (getClass () == StrictMode_OnVmViolationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.StrictMode+IOnVmViolationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onVmViolation (android.os.strictmode.Violation p0)
	{
		n_onVmViolation (p0);
	}

	private native void n_onVmViolation (android.os.strictmode.Violation p0);

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
