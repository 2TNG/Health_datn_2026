package mono.android.widget;


public class DatePicker_OnDateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.DatePicker.OnDateChangedListener
{

	public DatePicker_OnDateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == DatePicker_OnDateChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.DatePicker+IOnDateChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDateChanged (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateChanged (p0, p1, p2, p3);
	}

	private native void n_onDateChanged (android.widget.DatePicker p0, int p1, int p2, int p3);

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
