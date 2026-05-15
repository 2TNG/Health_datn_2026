package mono.android.media.audiofx;


public class PresetReverb_OnParameterChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.PresetReverb.OnParameterChangeListener
{

	public PresetReverb_OnParameterChangeListenerImplementor ()
	{
		super ();
		if (getClass () == PresetReverb_OnParameterChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.PresetReverb+IOnParameterChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onParameterChange (android.media.audiofx.PresetReverb p0, int p1, int p2, short p3)
	{
		n_onParameterChange (p0, p1, p2, p3);
	}

	private native void n_onParameterChange (android.media.audiofx.PresetReverb p0, int p1, int p2, short p3);

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
