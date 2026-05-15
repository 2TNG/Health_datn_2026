package mono.android.widget;


public class AdapterView_OnItemSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AdapterView.OnItemSelectedListener
{

	public AdapterView_OnItemSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == AdapterView_OnItemSelectedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.AdapterView+IOnItemSelectedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onItemSelected (android.widget.AdapterView p0, android.view.View p1, int p2, long p3)
	{
		n_onItemSelected (p0, p1, p2, p3);
	}

	private native void n_onItemSelected (android.widget.AdapterView p0, android.view.View p1, int p2, long p3);

	public void onNothingSelected (android.widget.AdapterView p0)
	{
		n_onNothingSelected (p0);
	}

	private native void n_onNothingSelected (android.widget.AdapterView p0);

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
