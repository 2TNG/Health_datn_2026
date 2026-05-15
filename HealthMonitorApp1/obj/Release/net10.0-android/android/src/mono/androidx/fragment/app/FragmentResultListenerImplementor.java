package mono.androidx.fragment.app;


public class FragmentResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.fragment.app.FragmentResultListener
{

	public FragmentResultListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentResultListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Fragment.App.IFragmentResultListenerImplementor, Xamarin.AndroidX.Fragment", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFragmentResult (java.lang.String p0, android.os.Bundle p1)
	{
		n_onFragmentResult (p0, p1);
	}

	private native void n_onFragmentResult (java.lang.String p0, android.os.Bundle p1);

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
