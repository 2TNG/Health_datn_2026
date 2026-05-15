package mono.android.media.audiofx;


public class Equalizer_OnParameterChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.Equalizer.OnParameterChangeListener
{

	public Equalizer_OnParameterChangeListenerImplementor ()
	{
		super ();
		if (getClass () == Equalizer_OnParameterChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.Equalizer+IOnParameterChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onParameterChange (android.media.audiofx.Equalizer p0, int p1, int p2, int p3, int p4)
	{
		n_onParameterChange (p0, p1, p2, p3, p4);
	}

	private native void n_onParameterChange (android.media.audiofx.Equalizer p0, int p1, int p2, int p3, int p4);

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
