package mono.androidx.fragment.app.strictmode;


public class FragmentStrictMode_OnViolationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener
{

	public FragmentStrictMode_OnViolationListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentStrictMode_OnViolationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Fragment.App.StrictMode.FragmentStrictMode+IOnViolationListenerImplementor, Xamarin.AndroidX.Fragment", "", this, new java.lang.Object[] {  });
		}
	}

	public void onViolation (androidx.fragment.app.strictmode.Violation p0)
	{
		n_onViolation (p0);
	}

	private native void n_onViolation (androidx.fragment.app.strictmode.Violation p0);

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
