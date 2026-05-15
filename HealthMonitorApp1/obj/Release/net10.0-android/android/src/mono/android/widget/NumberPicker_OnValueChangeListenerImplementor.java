package mono.android.widget;


public class NumberPicker_OnValueChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.NumberPicker.OnValueChangeListener
{

	public NumberPicker_OnValueChangeListenerImplementor ()
	{
		super ();
		if (getClass () == NumberPicker_OnValueChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.NumberPicker+IOnValueChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onValueChange (android.widget.NumberPicker p0, int p1, int p2)
	{
		n_onValueChange (p0, p1, p2);
	}

	private native void n_onValueChange (android.widget.NumberPicker p0, int p1, int p2);

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
