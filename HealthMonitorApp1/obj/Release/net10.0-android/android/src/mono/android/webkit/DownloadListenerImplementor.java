package mono.android.webkit;


public class DownloadListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.webkit.DownloadListener
{

	public DownloadListenerImplementor ()
	{
		super ();
		if (getClass () == DownloadListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Webkit.IDownloadListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDownloadStart (java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4)
	{
		n_onDownloadStart (p0, p1, p2, p3, p4);
	}

	private native void n_onDownloadStart (java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4);

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
