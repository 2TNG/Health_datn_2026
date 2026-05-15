package mono.android.widget;


public class ExpandableListView_OnGroupCollapseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnGroupCollapseListener
{

	public ExpandableListView_OnGroupCollapseListenerImplementor ()
	{
		super ();
		if (getClass () == ExpandableListView_OnGroupCollapseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ExpandableListView+IOnGroupCollapseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGroupCollapse (int p0)
	{
		n_onGroupCollapse (p0);
	}

	private native void n_onGroupCollapse (int p0);

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
