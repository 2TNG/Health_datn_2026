package mono.android.media;


public class MediaRecorder_OnErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaRecorder.OnErrorListener
{

	public MediaRecorder_OnErrorListenerImplementor ()
	{
		super ();
		if (getClass () == MediaRecorder_OnErrorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaRecorder+IOnErrorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onError (android.media.MediaRecorder p0, int p1, int p2)
	{
		n_onError (p0, p1, p2);
	}

	private native void n_onError (android.media.MediaRecorder p0, int p1, int p2);

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
