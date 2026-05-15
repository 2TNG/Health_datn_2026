package mono.android.graphics;


public class SurfaceTexture_OnFrameAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.graphics.SurfaceTexture.OnFrameAvailableListener
{

	public SurfaceTexture_OnFrameAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == SurfaceTexture_OnFrameAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Graphics.SurfaceTexture+IOnFrameAvailableListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFrameAvailable (android.graphics.SurfaceTexture p0)
	{
		n_onFrameAvailable (p0);
	}

	private native void n_onFrameAvailable (android.graphics.SurfaceTexture p0);

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
