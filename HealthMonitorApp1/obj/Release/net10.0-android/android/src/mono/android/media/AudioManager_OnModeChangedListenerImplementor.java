package mono.android.media;


public class AudioManager_OnModeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnModeChangedListener
{

	public AudioManager_OnModeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AudioManager_OnModeChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioManager+IOnModeChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onModeChanged (int p0)
	{
		n_onModeChanged (p0);
	}

	private native void n_onModeChanged (int p0);

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
