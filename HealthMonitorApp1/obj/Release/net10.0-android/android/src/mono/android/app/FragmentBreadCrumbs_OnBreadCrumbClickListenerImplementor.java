package mono.android.app;


public class FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener
{

	public FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.FragmentBreadCrumbs+IOnBreadCrumbClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onBreadCrumbClick (android.app.FragmentManager.BackStackEntry p0, int p1)
	{
		return n_onBreadCrumbClick (p0, p1);
	}

	private native boolean n_onBreadCrumbClick (android.app.FragmentManager.BackStackEntry p0, int p1);

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
