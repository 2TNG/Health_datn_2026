package mono.android.widget;


public class NumberPicker_OnScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.NumberPicker.OnScrollListener
{

	public NumberPicker_OnScrollListenerImplementor ()
	{
		super ();
		if (getClass () == NumberPicker_OnScrollListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.NumberPicker+IOnScrollListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollStateChange (android.widget.NumberPicker p0, int p1)
	{
		n_onScrollStateChange (p0, p1);
	}

	private native void n_onScrollStateChange (android.widget.NumberPicker p0, int p1);

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
