package mono.android.widget;


public class TimePicker_OnTimeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.TimePicker.OnTimeChangedListener
{

	public TimePicker_OnTimeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == TimePicker_OnTimeChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.TimePicker+IOnTimeChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTimeChanged (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeChanged (p0, p1, p2);
	}

	private native void n_onTimeChanged (android.widget.TimePicker p0, int p1, int p2);

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
