package mono.android.widget;


public class Filter_FilterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.Filter.FilterListener
{

	public Filter_FilterListenerImplementor ()
	{
		super ();
		if (getClass () == Filter_FilterListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.Filter+IFilterListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFilterComplete (int p0)
	{
		n_onFilterComplete (p0);
	}

	private native void n_onFilterComplete (int p0);

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
