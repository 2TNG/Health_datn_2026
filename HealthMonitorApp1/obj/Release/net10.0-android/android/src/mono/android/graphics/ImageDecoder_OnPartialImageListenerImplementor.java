package mono.android.graphics;


public class ImageDecoder_OnPartialImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.graphics.ImageDecoder.OnPartialImageListener
{

	public ImageDecoder_OnPartialImageListenerImplementor ()
	{
		super ();
		if (getClass () == ImageDecoder_OnPartialImageListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Graphics.ImageDecoder+IOnPartialImageListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onPartialImage (android.graphics.ImageDecoder.DecodeException p0)
	{
		return n_onPartialImage (p0);
	}

	private native boolean n_onPartialImage (android.graphics.ImageDecoder.DecodeException p0);

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
