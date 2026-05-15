package mono.android.view;


public class View_OnContextClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnContextClickListener
{

	public View_OnContextClickListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnContextClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnContextClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onContextClick (android.view.View p0)
	{
		return n_onContextClick (p0);
	}

	private native boolean n_onContextClick (android.view.View p0);

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
