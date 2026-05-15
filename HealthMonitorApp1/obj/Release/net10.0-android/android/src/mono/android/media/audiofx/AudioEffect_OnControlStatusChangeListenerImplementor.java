package mono.android.media.audiofx;


public class AudioEffect_OnControlStatusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.AudioEffect.OnControlStatusChangeListener
{

	public AudioEffect_OnControlStatusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AudioEffect_OnControlStatusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.AudioEffect+IOnControlStatusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onControlStatusChange (android.media.audiofx.AudioEffect p0, boolean p1)
	{
		n_onControlStatusChange (p0, p1);
	}

	private native void n_onControlStatusChange (android.media.audiofx.AudioEffect p0, boolean p1);

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
