package mono.android.widget;


public class ExpandableListView_OnGroupExpandListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnGroupExpandListener
{

	public ExpandableListView_OnGroupExpandListenerImplementor ()
	{
		super ();
		if (getClass () == ExpandableListView_OnGroupExpandListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ExpandableListView+IOnGroupExpandListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGroupExpand (int p0)
	{
		n_onGroupExpand (p0);
	}

	private native void n_onGroupExpand (int p0);

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
