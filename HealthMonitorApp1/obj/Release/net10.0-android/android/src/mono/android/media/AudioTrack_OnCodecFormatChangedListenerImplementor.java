package mono.android.media;


public class AudioTrack_OnCodecFormatChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioTrack.OnCodecFormatChangedListener
{

	public AudioTrack_OnCodecFormatChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AudioTrack_OnCodecFormatChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioTrack+IOnCodecFormatChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCodecFormatChanged (android.media.AudioTrack p0, android.media.AudioMetadataReadMap p1)
	{
		n_onCodecFormatChanged (p0, p1);
	}

	private native void n_onCodecFormatChanged (android.media.AudioTrack p0, android.media.AudioMetadataReadMap p1);

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
