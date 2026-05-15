package mono.android.hardware;


public class Camera_FaceDetectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.hardware.Camera.FaceDetectionListener
{

	public Camera_FaceDetectionListenerImplementor ()
	{
		super ();
		if (getClass () == Camera_FaceDetectionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Hardware.Camera+IFaceDetectionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFaceDetection (android.hardware.Camera.Face[] p0, android.hardware.Camera p1)
	{
		n_onFaceDetection (p0, p1);
	}

	private native void n_onFaceDetection (android.hardware.Camera.Face[] p0, android.hardware.Camera p1);

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
