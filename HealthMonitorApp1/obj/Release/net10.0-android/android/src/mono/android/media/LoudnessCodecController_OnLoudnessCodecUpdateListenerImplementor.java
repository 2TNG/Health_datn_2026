package mono.android.media;


public class LoudnessCodecController_OnLoudnessCodecUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener
{

	public LoudnessCodecController_OnLoudnessCodecUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == LoudnessCodecController_OnLoudnessCodecUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.LoudnessCodecController+IOnLoudnessCodecUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public android.os.Bundle onLoudnessCodecUpdate (android.media.MediaCodec p0, android.os.Bundle p1)
	{
		return n_onLoudnessCodecUpdate (p0, p1);
	}

	private native android.os.Bundle n_onLoudnessCodecUpdate (android.media.MediaCodec p0, android.os.Bundle p1);

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
