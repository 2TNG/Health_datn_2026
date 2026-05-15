package mono.android.widget;


public class AbsListView_OnScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AbsListView.OnScrollListener
{

	public AbsListView_OnScrollListenerImplementor ()
	{
		super ();
		if (getClass () == AbsListView_OnScrollListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.AbsListView+IOnScrollListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScroll (android.widget.AbsListView p0, int p1, int p2, int p3)
	{
		n_onScroll (p0, p1, p2, p3);
	}

	private native void n_onScroll (android.widget.AbsListView p0, int p1, int p2, int p3);

	public void onScrollStateChanged (android.widget.AbsListView p0, int p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (android.widget.AbsListView p0, int p1);

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
