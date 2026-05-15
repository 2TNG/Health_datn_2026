package mono.android.widget;


public class AdapterView_OnItemLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AdapterView.OnItemLongClickListener
{

	public AdapterView_OnItemLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == AdapterView_OnItemLongClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.AdapterView+IOnItemLongClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onItemLongClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3)
	{
		return n_onItemLongClick (p0, p1, p2, p3);
	}

	private native boolean n_onItemLongClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3);

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
