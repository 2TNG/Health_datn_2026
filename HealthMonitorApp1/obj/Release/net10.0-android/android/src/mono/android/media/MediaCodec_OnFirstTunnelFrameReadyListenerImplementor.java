package mono.android.media;


public class MediaCodec_OnFirstTunnelFrameReadyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaCodec.OnFirstTunnelFrameReadyListener
{

	public MediaCodec_OnFirstTunnelFrameReadyListenerImplementor ()
	{
		super ();
		if (getClass () == MediaCodec_OnFirstTunnelFrameReadyListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaCodec+IOnFirstTunnelFrameReadyListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFirstTunnelFrameReady (android.media.MediaCodec p0)
	{
		n_onFirstTunnelFrameReady (p0);
	}

	private native void n_onFirstTunnelFrameReady (android.media.MediaCodec p0);

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
