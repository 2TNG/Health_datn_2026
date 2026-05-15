package mono.android.widget;


public class ExpandableListView_OnGroupClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnGroupClickListener
{

	public ExpandableListView_OnGroupClickListenerImplementor ()
	{
		super ();
		if (getClass () == ExpandableListView_OnGroupClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ExpandableListView+IOnGroupClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onGroupClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, long p3)
	{
		return n_onGroupClick (p0, p1, p2, p3);
	}

	private native boolean n_onGroupClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, long p3);

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
