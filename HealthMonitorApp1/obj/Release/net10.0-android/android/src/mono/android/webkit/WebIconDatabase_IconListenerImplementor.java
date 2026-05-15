package mono.android.webkit;


public class WebIconDatabase_IconListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.webkit.WebIconDatabase.IconListener
{

	public WebIconDatabase_IconListenerImplementor ()
	{
		super ();
		if (getClass () == WebIconDatabase_IconListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Webkit.WebIconDatabase+IIconListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onReceivedIcon (java.lang.String p0, android.graphics.Bitmap p1)
	{
		n_onReceivedIcon (p0, p1);
	}

	private native void n_onReceivedIcon (java.lang.String p0, android.graphics.Bitmap p1);

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
