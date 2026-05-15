package mono.android.os;


public class StrictMode_OnThreadViolationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.StrictMode.OnThreadViolationListener
{

	public StrictMode_OnThreadViolationListenerImplementor ()
	{
		super ();
		if (getClass () == StrictMode_OnThreadViolationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.StrictMode+IOnThreadViolationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onThreadViolation (android.os.strictmode.Violation p0)
	{
		n_onThreadViolation (p0);
	}

	private native void n_onThreadViolation (android.os.strictmode.Violation p0);

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
