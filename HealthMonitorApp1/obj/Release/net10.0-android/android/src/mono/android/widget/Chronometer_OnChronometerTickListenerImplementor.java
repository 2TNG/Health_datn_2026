package mono.android.widget;


public class Chronometer_OnChronometerTickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.Chronometer.OnChronometerTickListener
{

	public Chronometer_OnChronometerTickListenerImplementor ()
	{
		super ();
		if (getClass () == Chronometer_OnChronometerTickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.Chronometer+IOnChronometerTickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChronometerTick (android.widget.Chronometer p0)
	{
		n_onChronometerTick (p0);
	}

	private native void n_onChronometerTick (android.widget.Chronometer p0);

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
