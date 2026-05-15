package mono.android.webkit;


public class WebView_FindListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.webkit.WebView.FindListener
{

	public WebView_FindListenerImplementor ()
	{
		super ();
		if (getClass () == WebView_FindListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Webkit.WebView+IFindListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFindResultReceived (int p0, int p1, boolean p2)
	{
		n_onFindResultReceived (p0, p1, p2);
	}

	private native void n_onFindResultReceived (int p0, int p1, boolean p2);

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
