package mono.android.webkit;


public class WebView_PictureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.webkit.WebView.PictureListener
{

	public WebView_PictureListenerImplementor ()
	{
		super ();
		if (getClass () == WebView_PictureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Webkit.WebView+IPictureListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onNewPicture (android.webkit.WebView p0, android.graphics.Picture p1)
	{
		n_onNewPicture (p0, p1);
	}

	private native void n_onNewPicture (android.webkit.WebView p0, android.graphics.Picture p1);

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
