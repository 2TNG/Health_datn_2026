package mono.android.widget;


public class ExpandableListView_OnChildClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnChildClickListener
{

	public ExpandableListView_OnChildClickListenerImplementor ()
	{
		super ();
		if (getClass () == ExpandableListView_OnChildClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ExpandableListView+IOnChildClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4)
	{
		return n_onChildClick (p0, p1, p2, p3, p4);
	}

	private native boolean n_onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4);

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
