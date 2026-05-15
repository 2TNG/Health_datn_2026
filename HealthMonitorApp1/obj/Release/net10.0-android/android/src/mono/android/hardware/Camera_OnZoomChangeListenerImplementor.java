package mono.android.hardware;


public class Camera_OnZoomChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.hardware.Camera.OnZoomChangeListener
{

	public Camera_OnZoomChangeListenerImplementor ()
	{
		super ();
		if (getClass () == Camera_OnZoomChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Hardware.Camera+IOnZoomChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onZoomChange (int p0, boolean p1, android.hardware.Camera p2)
	{
		n_onZoomChange (p0, p1, p2);
	}

	private native void n_onZoomChange (int p0, boolean p1, android.hardware.Camera p2);

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
