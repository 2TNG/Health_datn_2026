package mono.android.media;


public class MediaScannerConnection_OnScanCompletedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaScannerConnection.OnScanCompletedListener
{

	public MediaScannerConnection_OnScanCompletedListenerImplementor ()
	{
		super ();
		if (getClass () == MediaScannerConnection_OnScanCompletedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaScannerConnection+IOnScanCompletedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScanCompleted (java.lang.String p0, android.net.Uri p1)
	{
		n_onScanCompleted (p0, p1);
	}

	private native void n_onScanCompleted (java.lang.String p0, android.net.Uri p1);

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
