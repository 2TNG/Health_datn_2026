package mono.androidx.lifecycle;


public class ReportFragment_ActivityInitializationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.lifecycle.ReportFragment.ActivityInitializationListener
{

	public ReportFragment_ActivityInitializationListenerImplementor ()
	{
		super ();
		if (getClass () == ReportFragment_ActivityInitializationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Lifecycle.ReportFragment+IActivityInitializationListenerImplementor, Xamarin.AndroidX.Lifecycle.Runtime.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();

	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();

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
