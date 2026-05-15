package mono.android.media;


public class AudioManager_OnAudioFocusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnAudioFocusChangeListener
{

	public AudioManager_OnAudioFocusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AudioManager_OnAudioFocusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioManager+IOnAudioFocusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAudioFocusChange (int p0)
	{
		n_onAudioFocusChange (p0);
	}

	private native void n_onAudioFocusChange (int p0);

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
