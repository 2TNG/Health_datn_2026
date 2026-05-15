package mono.android.media;


public class ImageWriter_OnImageReleasedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.ImageWriter.OnImageReleasedListener
{

	public ImageWriter_OnImageReleasedListenerImplementor ()
	{
		super ();
		if (getClass () == ImageWriter_OnImageReleasedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.ImageWriter+IOnImageReleasedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onImageReleased (android.media.ImageWriter p0)
	{
		n_onImageReleased (p0);
	}

	private native void n_onImageReleased (android.media.ImageWriter p0);

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
