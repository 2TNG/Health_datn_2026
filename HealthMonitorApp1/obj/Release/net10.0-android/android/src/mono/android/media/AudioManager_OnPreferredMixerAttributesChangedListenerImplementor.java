package mono.android.media;


public class AudioManager_OnPreferredMixerAttributesChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnPreferredMixerAttributesChangedListener
{

	public AudioManager_OnPreferredMixerAttributesChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AudioManager_OnPreferredMixerAttributesChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioManager+IOnPreferredMixerAttributesChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPreferredMixerAttributesChanged (android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1, android.media.AudioMixerAttributes p2)
	{
		n_onPreferredMixerAttributesChanged (p0, p1, p2);
	}

	private native void n_onPreferredMixerAttributesChanged (android.media.AudioAttributes p0, android.media.AudioDeviceInfo p1, android.media.AudioMixerAttributes p2);

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
