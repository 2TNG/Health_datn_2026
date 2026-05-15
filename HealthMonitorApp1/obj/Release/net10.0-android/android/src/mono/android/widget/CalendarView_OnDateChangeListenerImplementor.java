package mono.android.widget;


public class CalendarView_OnDateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.CalendarView.OnDateChangeListener
{

	public CalendarView_OnDateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == CalendarView_OnDateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.CalendarView+IOnDateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSelectedDayChange (android.widget.CalendarView p0, int p1, int p2, int p3)
	{
		n_onSelectedDayChange (p0, p1, p2, p3);
	}

	private native void n_onSelectedDayChange (android.widget.CalendarView p0, int p1, int p2, int p3);

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
