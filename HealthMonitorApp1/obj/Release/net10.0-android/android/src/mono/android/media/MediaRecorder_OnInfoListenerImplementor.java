package mono.android.media;


public class MediaRecorder_OnInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaRecorder.OnInfoListener
{

	public MediaRecorder_OnInfoListenerImplementor ()
	{
		super ();
		if (getClass () == MediaRecorder_OnInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaRecorder+IOnInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onInfo (android.media.MediaRecorder p0, int p1, int p2)
	{
		n_onInfo (p0, p1, p2);
	}

	private native void n_onInfo (android.media.MediaRecorder p0, int p1, int p2);

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
