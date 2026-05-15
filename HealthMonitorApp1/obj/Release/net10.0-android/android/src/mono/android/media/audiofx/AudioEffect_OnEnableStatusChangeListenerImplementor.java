package mono.android.media.audiofx;


public class AudioEffect_OnEnableStatusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.AudioEffect.OnEnableStatusChangeListener
{

	public AudioEffect_OnEnableStatusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AudioEffect_OnEnableStatusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.AudioEffect+IOnEnableStatusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEnableStatusChange (android.media.audiofx.AudioEffect p0, boolean p1)
	{
		n_onEnableStatusChange (p0, p1);
	}

	private native void n_onEnableStatusChange (android.media.audiofx.AudioEffect p0, boolean p1);

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
