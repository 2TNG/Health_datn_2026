package mono.android.media;


public class AudioManager_OnCommunicationDeviceChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnCommunicationDeviceChangedListener
{

	public AudioManager_OnCommunicationDeviceChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AudioManager_OnCommunicationDeviceChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioManager+IOnCommunicationDeviceChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCommunicationDeviceChanged (android.media.AudioDeviceInfo p0)
	{
		n_onCommunicationDeviceChanged (p0);
	}

	private native void n_onCommunicationDeviceChanged (android.media.AudioDeviceInfo p0);

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
