package mono.android.media.audiofx;


public class Visualizer_OnDataCaptureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.Visualizer.OnDataCaptureListener
{

	public Visualizer_OnDataCaptureListenerImplementor ()
	{
		super ();
		if (getClass () == Visualizer_OnDataCaptureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.Visualizer+IOnDataCaptureListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFftDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2)
	{
		n_onFftDataCapture (p0, p1, p2);
	}

	private native void n_onFftDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2);

	public void onWaveFormDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2)
	{
		n_onWaveFormDataCapture (p0, p1, p2);
	}

	private native void n_onWaveFormDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2);

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
