package mono.android.graphics;


public class ImageDecoder_OnHeaderDecodedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.graphics.ImageDecoder.OnHeaderDecodedListener
{

	public ImageDecoder_OnHeaderDecodedListenerImplementor ()
	{
		super ();
		if (getClass () == ImageDecoder_OnHeaderDecodedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Graphics.ImageDecoder+IOnHeaderDecodedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onHeaderDecoded (android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2)
	{
		n_onHeaderDecoded (p0, p1, p2);
	}

	private native void n_onHeaderDecoded (android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2);

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
