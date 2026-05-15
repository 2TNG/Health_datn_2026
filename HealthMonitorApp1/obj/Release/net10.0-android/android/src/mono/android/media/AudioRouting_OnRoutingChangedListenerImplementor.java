package mono.android.media;


public class AudioRouting_OnRoutingChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioRouting.OnRoutingChangedListener
{

	public AudioRouting_OnRoutingChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AudioRouting_OnRoutingChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.IAudioRoutingOnRoutingChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRoutingChanged (android.media.AudioRouting p0)
	{
		n_onRoutingChanged (p0);
	}

	private native void n_onRoutingChanged (android.media.AudioRouting p0);

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
